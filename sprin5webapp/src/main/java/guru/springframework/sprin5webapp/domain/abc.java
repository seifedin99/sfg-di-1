package guru.springframework.sprin5webapp.domain;

import java.util.Objects;

public class abc {


    private String firstNa;
    private String lastNam;

    public abc(String firstNa, String lastNam) {
        this.firstNa = firstNa;
        this.lastNam = lastNam;
    }

    @Override
    public String toString() {
        return "abc{" +
                "firstNa='" + firstNa + '\'' +
                ", lastNam='" + lastNam + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        abc abc = (abc) o;
        return Objects.equals(firstNa, abc.firstNa) && Objects.equals(lastNam, abc.lastNam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNa, lastNam);
    }
}
