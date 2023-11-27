import java.util.Date;

public class Journal {

    int ticketNum[];  // читательские билеты (пронумерованные)
    int days;  // количество дней, на которые выдана книга
    Date dateIssue; // дата выдачи
    Date returnDate = dateIssue + days; //дата возврата = дата выдачи + кол-во дней
    Date actualDate; //фактическая дата возврата
}


