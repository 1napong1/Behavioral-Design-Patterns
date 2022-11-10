package BehavioralDesignPatterns;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {
	@Override
	public void customSort(List<Person> people) {Collections.sort(people, Comparator.comparing( Person::getWeight));}
}