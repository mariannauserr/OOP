import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {
    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "8,8", "9,9", "-1,0", "10,0"})
    public void setCurrentStationTest(int dataStation, int expected) {
        Radio station = new Radio();

        station.setCurrentStation(dataStation);

        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
}
