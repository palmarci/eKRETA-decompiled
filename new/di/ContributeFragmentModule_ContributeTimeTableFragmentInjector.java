package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.timetable.TimeTableFragment;
import i.c.a;

public abstract class ContributeFragmentModule_ContributeTimeTableFragmentInjector {

    @FragmentScope
    public interface TimeTableFragmentSubcomponent extends a<TimeTableFragment> {

        public static abstract class Builder extends a.C0107a<TimeTableFragment> {
        }
    }
}
