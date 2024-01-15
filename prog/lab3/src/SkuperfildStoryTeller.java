import interfaces.*;

public class SkuperfildStoryTeller implements StoryTellerable {
    private Washable washable;
    private HygieneItem mySoap;
    private HygieneItem crabSoap;
    private Skuperfild skuperfild;

    public SkuperfildStoryTeller(Washable washable, HygieneItem mySoap, HygieneItem crabSoap, Skuperfild skuperfild) {
        this.washable = washable;
        this.mySoap = mySoap;
        this.crabSoap = crabSoap;
        this.skuperfild = skuperfild;
    }

    @Override
    public void tellStory() {
        System.out.println("Господин " + skuperfild.getName() + " достал из своего цилиндра еще кусок " + mySoap.getScentType().getRussianName() + " мыла, но тут же заметил на полочке у рукомойника другой, точно такой же кусок мыла, принадлежавший " + crabSoap.getOwner() + ".");
        System.out.println("Положив свое мыло рядышком, господин " + skuperfild.getName() + " некоторое время смотрел на оба эти куска, после чего принялся старательно намыливать руки и щеки; однако не своим мылом, а тем, которое лежало рядом.");

        washable.wash(mySoap.getName());

        System.out.println("Умывшись как следует, господин " + skuperfild.getName() + " решил также почистить зубы, причем совал зубную щетку не в ту коробочку, где был его порошок, а в ту, которая принадлежала " + crabSoap.getOwner() + ".");
        System.out.println("Почистив зубы, господин " + skuperfild.getName() + " еще долгое время открывал то одну коробочку, то другую, стараясь определить, какой порошок лучше пахнет: тот, который принадлежал ему, или принадлежавший " + crabSoap.getOwner() + ".");
        System.out.println("Кончились эти эксперименты тем, что он чихнул как раз в тот момент, когда совал свой нос в коробку, и весь порошок взвился кверху на манер облака.");
    }
}
