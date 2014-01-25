package primaafp.test;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;


import primaafp.negocio.GestionContratoAfiliacion;
import primaafp.excepcion.DAOExcepcion;
import primaafp.modelo.ContratoAfiliacion;

public class GestionContratoAfiliacionTest {

	@Test
		public void insertarTest() {

			GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

			try {
				negocio.insertar(123,"11/12/2013","DNI", "456123","PRO1","Daniel","Manuel","Minaya","Cruces","Junin","Huancavelica","Toro Seco","Loma Umbrosa 520","Lima","Lima","Lima","Al cotado de una casa","5555555");

//				Categoria nuevo = negocio.obtener(7);

//				Assert.assertEquals("Categoria de electrónicos", nuevo.getDescripcion());

			} catch (DAOExcepcion e) {
				Assert.fail("Fallo la inserción: " + e.getMessage());
			}
		}

}
