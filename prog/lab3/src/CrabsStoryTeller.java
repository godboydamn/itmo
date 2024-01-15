import interfaces.StoryTellerable;

public class CrabsStoryTeller implements StoryTellerable {
    private HygieneItem myPowder;
    private HygieneItem skuperfildPowder;
    private Crabs crabs;

    public CrabsStoryTeller(HygieneItem myPowder, HygieneItem skuperfildPowder, Crabs crabs) {
        this.myPowder = myPowder;
        this.skuperfildPowder = skuperfildPowder;
        this.crabs = crabs;
    }

    @Override
    public void tellStory() {
        System.out.println("Смешанные запахи его вещей и неожиданный беспорядок заставили " + crabs.getName() + " быть более осторожным с хранением своих личных предметов.");

        System.out.println( crabs.getName() + ", обнаружив, что кто-то тронул его вещи, осторожно попытался узнать, кто это сделал, но внезапный чих смешал ароматы, оставив его в замешательстве.");
        System.out.println("Взбешенный беспорядком, " + crabs.getName() + ", пытаясь разобраться в ситуации, невольно перепутал содержимое коробочек, вызвав у себя лишь улыбку.");

        System.out.println("Текущие порошки: " + myPowder.getScentType().getRussianName() + " (принадлежащий " + crabs.getName() + ") и " + skuperfildPowder.getScentType().getRussianName() + " (принадлежащий Скуперфильду).");

        System.out.println(crabs.getName() + ", пытаясь понять, какой порошок лучше, вдруг понял, что смешивание ароматов вызывает у него улыбку.");
    }
}
