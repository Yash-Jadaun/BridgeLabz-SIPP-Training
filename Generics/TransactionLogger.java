package Generics;


import java.time.LocalDateTime;
import java.util.*;

class TransactionLogger {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN1","TXN2","TXN3");
        transactionIds.forEach(id->System.out.println(LocalDateTime.now()+" - Transaction: "+id));
    }
}
