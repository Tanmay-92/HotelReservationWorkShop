package HotelReservation;

import java.util.Objects;

public class HotelReservationSystem {

    private String hotel;
    private int regularCustomerWeekdayRate;

    public HotelReservationSystem(String hotel, int regularCustomerWeekdayRate)
    {
        this.hotel = hotel;
        this.regularCustomerWeekdayRate = regularCustomerWeekdayRate;
    }

    public String getHotelName()
    {
        return hotel;
    }

    public void setHotelName(String hotel)
    {
        this.hotel = hotel;
    }

    public int getRegularCustomerWeekdayRate()
    {
        return regularCustomerWeekdayRate;
    }

    public void setRegularCustomerWeekdayRate(int regularCustomerWeekdayRate)
    {
        this.regularCustomerWeekdayRate = regularCustomerWeekdayRate;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HotelReservationSystem other = (HotelReservationSystem) obj;
        return Objects.equals(hotel, other.hotel) && regularCustomerWeekdayRate == other.regularCustomerWeekdayRate;
    }



}

