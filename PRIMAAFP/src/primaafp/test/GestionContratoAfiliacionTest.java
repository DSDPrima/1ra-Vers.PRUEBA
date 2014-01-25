package primaafp.test;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;


import primaafp.negocio.GestionContratoAfiliacion;
import primaafp.excepcion.DAOExcepcion;
import primaafp.modelo.ContratoAfiliacion;

public class GestionContratoAfiliacionTest {

	//@Test
		public void insertarTest() {

			GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

			try {
				negocio.insertar(7777,"11/12/2013","DNI", "456123","PRO1","Daniel","Manuel","Minaya","Cruces","Junin","Huancavelica","Toro Seco","Loma Umbrosa 520","Lima","Lima","Lima","Al cotado de una casa","5555555");

//				Categoria nuevo = negocio.obtener(7);

//				Assert.assertEquals("Categoria de electrónicos", nuevo.getDescripcion());

			} catch (DAOExcepcion e) {
				Assert.fail("Fallo la inserción: " + e.getMessage());
			}
		}

@Test
		public void listarTest() {

				GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

				try {
					Collection<ContratoAfiliacion> listado = negocio.listar(8888);

					// System.out.println(listado.size());
					
					for (ContratoAfiliacion c : listado)
					{
						System.out.println(c.getNroFormulario() + ' ' + c.getFechaSuscripcion() + ' ' + c.getTipoDocumento() + ' ' + c.getNroDocumento() + ' ' + c.getCodigoPromotor() + ' ' + c.getPrimerNombre() + ' ' + c.getSegundoNombre() + ' ' + c.getApellidoPaterno() + ' ' + c.getApellidoMaterno() + ' ' + c.getDepartamentoNacimiento() + ' ' + c.getProvinciaNacimiento() + ' ' + c.getDistritoNacimiento() + ' ' + c.getDireccion() + ' ' + c.getDepartamento() + ' ' + c.getProvincia() + ' ' + c.getDistrito() + ' ' + c.getReferencia() + ' ' + c.getTelefono());
					}

					Assert.assertTrue(listado.size() > 0);

				} catch (DAOExcepcion e) {

					Assert.fail("Falló el listado: " + e.getMessage());

				}

			}
	
		
}
