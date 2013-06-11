import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChanceTest {
    @Test
    public void or_another_chance(){
        Chance chanceA = new Chance(0.1);
        Chance chanceB = new Chance(0.1);

        Chance result = chanceA.or(chanceB);

        assertThat(result, is(new Chance(0.2)));
    }

    @Test
    public void should_be_equals_to_itself(){
        Chance change = new Chance(0.5);

        assertThat(change.equals(change), is(true));
    }

    @Test
    public void should_not_be_equals_to_null() {
        Chance chance = new Chance(0.3);

        assertThat(chance.equals(null), is(false));
    }

    @Test
    public void should_be_equals_to_another_chance_with_same_probability() {
        Chance chance = new Chance(0.5);
        Chance anotherChance = new Chance(0.5);

        assertThat(chance.equals(anotherChance), is(true));
    }

    @Test
    public void should_not_be_equals_to_another_chance_with_different_probability() {
        Chance chance = new Chance(0.5);
        Chance anotherChance = new Chance(0.6);

        assertThat(chance.equals(anotherChance), is(false));
    }


    @Test
    public void should_not_be_equals_to_another_object_from_different_class(){
        Chance chance =  new Chance(0.4);
        Object object = new Object();

        assertThat(chance.equals(object), is(false));
    }
}
