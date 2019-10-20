import java.time.ZonedDateTime;

public class Test{

//ouvre bien le vol
@Test
public void ouvrir() {
	assertTrue("true");
}

//ferme bien le vol
@Test
public void fermee() {
	assertTrue("false");
}

//echouer pour une date d'arrivée après une date de départ
@Test(expected = IllegalArgumentException.class)
public void Testduree () {
	assertFalse(duree(ZonedDateTime depart, ZonedDateTime arrivee), -1);
}

//mois supérieur à 12
@Test(expected = IllegalArgumentException.class)
public void TestMois() {
    assertFalse(ZonedDateTime.getMonth(), 13);
}

//jour supérieur à 31
@Test(expected = IllegalArgumentException.class)
public void TestMois() {
  assertFalse(ZonedDateTime.getDay(), 32);
}

}

