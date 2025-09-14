
/**
 * Décrivez votre classe TuneCreator ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TuneCreator
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private MidiPlayer player;
    private SimpleTune simpleStorage;
    /**
     * Constructeur d'objets de classe TuneCreator
     */
    public TuneCreator()
    {
        // initialisation des variables d'instance
        player = new MidiPlayer();
    }

    /**
     * CreateAndPlay
     *Saves a SimpleTune and plays it
     * Simple as that
     * @param noteName The name of the note; e.g., "C", "C#", "E5", etc.
     * @param duration The length of time the note should be played for.
     */
    public void CreateAndPlay(String noteName, int duration)
    {
        simpleStorage = new SimpleTune();
        simpleStorage.addNote(noteName, duration);
        player.playTune(simpleStorage);
    }
    
        /**
     * Set the instrument to be used.
     * @param instrument A positive value within the range of available instruments.
     */
    public void setInstrument(int instrument)
    {
        simpleStorage.setInstrument(instrument);
    }
}