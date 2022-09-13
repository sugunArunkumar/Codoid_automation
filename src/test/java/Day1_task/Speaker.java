package Day1_task;

public class Speaker implements Power,Volume,Play_pause{
    @Override
    public void play() {

        System.out.println("play the song");

    }

    @Override
    public void Pause() {

        System.out.println("pause the song");

    }

    @Override
    public void poweron() {

        System.out.println("on the speaker");

    }

    @Override
    public void poweroff() {

        System.out.println("off the speaker");

    }

    @Override
    public void volumeup() {

        System.out.println("increase the volume");

    }

    @Override
    public void volumedown() {

        System.out.println("decrease the volume");

    }

    @Override
    public void mute() {

        System.out.println("mute the volume");

    }
}
