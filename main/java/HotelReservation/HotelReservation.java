package HotelReservation;

import java.util.ArrayList;
import java.util.List;

    public class HotelReservation
    {
        final HotelReservationSystem LAKEWOOD = new HotelReservationSystem("LakeWood", 110);
        final HotelReservationSystem BRIDGEWOOD = new HotelReservationSystem("BridgeWood", 150);
        final HotelReservationSystem RIDGEWOOD = new HotelReservationSystem("RidgeWood", 220);

        List<HotelReservationSystem> hotel = new ArrayList<>();
        public HotelReservation()
        {
            hotel.add(LAKEWOOD);
            hotel.add(BRIDGEWOOD);
            hotel.add(RIDGEWOOD);
        }
        public void add(HotelReservationSystem hotel1)
        {

        }
        public List<HotelReservationSystem> getHotelList()
        {
            return hotel;
        }
    }

