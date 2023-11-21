import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.increaseVolume();

        int expected = 9;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void shouldReductionVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.reductionVolume();

        int expected = 7;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.reductionVolume();

        int expected = 100;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void shouldSetCurrentVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.reductionVolume();

        int expected = 0;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }
}
