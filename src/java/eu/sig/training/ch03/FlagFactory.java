package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlagFactory {

    private HashMap<Nationality, List<Color> > m_flags;

    public FlagFactory(){
        initFlags();
    }

    private void initFlags()
    {
        m_flags = new HashMap<Nationality, List<Color> >();

        m_flags.putIfAbsent(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        m_flags.putIfAbsent(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        m_flags.putIfAbsent(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        m_flags.putIfAbsent(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        m_flags.putIfAbsent(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        m_flags.putIfAbsent(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        m_flags.putIfAbsent(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        m_flags.putIfAbsent(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        m_flags.putIfAbsent(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        m_flags.putIfAbsent(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
        m_flags.putIfAbsent(Nationality.UNCLASSIFIED, Arrays.asList(Color.GRAY));
    }



    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        if(m_flags.containsKey(nationality)){
            return m_flags.get(nationality);
        }
        else {
            return m_flags.get(Nationality.UNCLASSIFIED);
        }

    }
    // end::getFlag[]

}