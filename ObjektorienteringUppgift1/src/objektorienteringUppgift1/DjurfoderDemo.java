package objektorienteringUppgift1;

import java.util.ArrayList;
import java.util.List;

public class DjurfoderDemo {
	final Hund Sixten = new Hund (5000 , "hundfoder", "Sixten");
	final Hund Dogge = new Hund(10000,"hundfoder", "Dogge");
	final Katt Venus = new Katt(5000, "kattfoder", "Venus");
	final Katt Ove = new Katt(3000, "kattfoder", "Ove");
	final Orm Hypno = new Orm(1000, "ormpellets", "Hypno");

	public List<IFood> getAllFoods(){
    	List<IFood>allFoods = new ArrayList<>();
    	allFoods.add(Sixten);
    	allFoods.add(Dogge);
    	allFoods.add(Venus);
    	allFoods.add(Ove);
    	allFoods.add(Hypno);
    	
    	return allFoods;
	}
	}
