package com.codecool.pa;

public class Concert {
    private static final int MINIMUM_TICKET_PRICE = 12000;
    private static final int MAXIMUM_TICKET_PRICE = 15000;

    private final Band mainBand;
    private final Band warmUpBand;
    private final ConcertType concertType;
    private final int ticketPrice;
    private int ticketsSold = 0;
    private int beersSold = 0;
    private boolean isOver = false;

    public Concert(Band mainBand, Band warmUpBand, ConcertType concertType, int ticketPrice) {
        if (ticketPrice < MINIMUM_TICKET_PRICE || ticketPrice > MAXIMUM_TICKET_PRICE) {
            throw new IllegalArgumentException(
                    "Not a valid ticket price! " +
                    "Must be between " + MINIMUM_TICKET_PRICE + " and " + MAXIMUM_TICKET_PRICE + "!"
            );
        }
        this.mainBand = mainBand;
        this.warmUpBand = warmUpBand;
        this.concertType = concertType;
        this.ticketPrice = ticketPrice;
    }

    public ConcertType getConcertType() {
        return concertType;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public int getBeersSold() {
        return beersSold;
    }

    public String getMainBandName() {
        return mainBand.getName();
    }

    public String getWarmUpBandName() {
        return warmUpBand.getName();
    }

    public Style getStyle() {
        return mainBand.getStyle();
    }

    public int getCapacity() {
        return concertType.getCapacity();
    }

    public int getDuration() {
        return concertType.getDuration();
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }

    public boolean sellTicket() {
        if (ticketsSold < concertType.getCapacity()) {
            ticketsSold++;
            return true;
        }
        System.out.println("No more tickets are available!");
        return false;
    }

    public void sellBeer() {
        beersSold++;
    }

    public double getProfit() {
        if (isOver) {
            throw new IllegalStateException("Profit was already given!");
        }
        isOver = true;
        return (ticketsSold * ticketPrice) * 0.40 + (beersSold * concertType.getBeerPrice());
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void cancel(String reason) {
        System.out.println("Concert is cancelled because of : " + reason);
        isOver = true;
    }
}
