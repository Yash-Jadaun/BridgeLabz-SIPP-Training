package Generics;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

class ExpiringMemberships {
    static class Member {
        String name; LocalDate expiry;
        Member(String n, LocalDate e){ name=n; expiry=e; }
        public String toString(){ return name+" expires "+expiry; }
    }

    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("X", LocalDate.now().plusDays(10)),
            new Member("Y", LocalDate.now().plusDays(40)),
            new Member("Z", LocalDate.now().plusDays(25))
        );
        members.stream()
               .filter(m-> ChronoUnit.DAYS.between(LocalDate.now(), m.expiry) <= 30)
               .forEach(System.out::println);
    }
}
