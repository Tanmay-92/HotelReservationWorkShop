package HotelReservationTest;

import HotelReservation.HotelReservation;
import HotelReservation.HotelReservationSystem;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HotelReservationTest {

    @Test
    public void whenHotelAddedToSystemShouldGetAdded() {
        HotelReservationSystem hotel1 = new HotelReservationSystem("Lakeewood", 110);
        HotelReservationSystem hotel2 = new HotelReservationSystem("Bridgewood", 160);
        HotelReservationSystem hotel3 = new HotelReservationSystem("Ridgewood", 220);
        HotelReservationSystem[] hotelList = {hotel1, hotel2, hotel3};
        List<HotelReservationSystem> hotels = Arrays.asList(hotelList);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add(hotel1);
        hotelReservation.add(hotel2);
        hotelReservation.add(hotel3);
        List<HotelReservationSystem> result = hotelReservation.getHotelList();

    }

    private void assertEquals(List<HotelReservationSystem> hotels, List<HotelReservationSystem> result) {
        assertEquals(hotels, result);
    }
}

