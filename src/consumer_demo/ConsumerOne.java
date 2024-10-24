package consumer_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerOne {
	
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Hanuman","Teja","Heroin"));
		list.add(new Movie("Spider Mam","Tom Holland","Zyndaya"));
		
		System.out.println(list);
		
		Consumer<String> c = s->System.out.println(s);
		c.accept("Bhuvaneswar");
		
		Consumer<Movie> c1 = m -> {
			System.out.println("Movie = " + m.name);
			System.out.println("Hero = " + m.hero);
			System.out.println("Heroin = " + m.heroin);
			System.out.println();
		};
		
		for(Movie m : list) {
			c1.accept(m);			
		}
	}	

}

class Movie{
	String name;
	String hero;
	String heroin;
	
	Movie(String name,String hero,	String heroin){
		this.name = name;
		this.hero=hero;
		this.heroin = heroin;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", hero=" + hero + ", heroin=" + heroin + "]";
	}
	
}
