package pl.marcinchwedczuk.polishholidays;

import java.util.List;

interface HolidaysLibrary {

    List<HolidayDefinition> holidaysDefinitions();

    int validSinceYearIncluding();
}
