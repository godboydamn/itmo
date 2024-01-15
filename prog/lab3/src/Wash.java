import interfaces.Washable;
public class Wash implements Washable {
    @Override
    public void wash(String item) {
        System.out.println("Положив свое мыло рядышком, господин Скуперфильд некоторое время смотрел на оба эти куска, после чего принялся старательно намыливать руки и щеки; однако не своим мылом, а тем, которое лежало рядом.");
    }

    @Override
    public void clean(String item) {
        System.out.println("Умывшись как следует, господин Скуперфильд решил также почистить зубы, причем совал зубную щетку не в ту коробочку, где был его порошок, а в ту, которая принадлежала Крабсу.");
    }
}
