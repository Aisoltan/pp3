public  class CinemaTicket{
    String cinema_name;
    String cinema_title;
    int row;
    int seat;
    double price;
    // methods
    public CinemaTicket(String cinema_name, String cinema_title, int row, int seat, double price){
        this.cinema_name = cinema_name;
        this.cinema_title = cinema_title;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }
    public void DisplayTickets(){
        System.out.println("TICKET INFO");
        System.out.println("cinema name" + cinema_name);
        System.out.println("Film" + cinema_title);
        System.out.println("row" + row);
        System.out.println("seat" + seat);
        System.out.println("Ticket price" + price);
    
    }
    public static void main(String[] args){
        CinemaTicket T1 = new CinemaTicket("ChaplinCinemas", "Marvel", 12, 43, 50);
        CinemaTicket T2 = new CinemaTicket("ChaplinCinemas", "Avatar", 23, 21, 53);
        T1.DisplayTickets();
        T2.DisplayTickets();
    }
}
