package pl.marcinchwedczuk.polishholidays;

import java.util.Arrays;
import java.util.List;

import static pl.marcinchwedczuk.polishholidays.HolidayDateAlgorithms.fixedAtMonthDay;
import static pl.marcinchwedczuk.polishholidays.HolidayDateAlgorithms.relativeToEaster;
import static pl.marcinchwedczuk.polishholidays.HolidayType.*;

public class PortugueseHolidaysLibrary implements HolidaysLibrary {

    private final HolidayDefinition newYearsDay =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(1, 1))
                    .withEnglishName("New Year's Day")
                    .withPolishName("Ano Novo")
                    .withHolidayType(OTHER)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition carnival =
            HolidayDefinition.newBuilder()
                    .withDate(relativeToEaster(-47))
                    .withEnglishName("Carnival")
                    .withPolishName("Carnaval")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition goodFriday =
            HolidayDefinition.newBuilder()
                    .withDate(relativeToEaster(-2))
                    .withEnglishName("Good Friday")
                    .withPolishName("Sexta-feira Santa")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition easter =
            HolidayDefinition.newBuilder()
                    .withDate(new EasterDateHolidayDateAlgorithm())
                    .withEnglishName("Easter")
                    .withPolishName("Domingo de Páscoa")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition freedomDay =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(4, 24))
                    .withEnglishName("Freedom Day")
                    .withPolishName("Dia da Liberdade")
                    .withHolidayType(NATIONAL)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition labourDay =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(5, 1))
                    .withEnglishName("Labour Day")
                    .withPolishName("Dia do Trabalhador")
                    .withHolidayType(OTHER)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition corpusChristi =
            HolidayDefinition.newBuilder()
                    .withDate(relativeToEaster(60))
                    .withEnglishName("Feast of Corpus Christi")
                    .withPolishName("Corpo de Deus")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition portugalDay =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(6, 10))
                    .withEnglishName("Portugal Day")
                    .withPolishName("Dia de Portugal, de Camões e das Comunidades Portuguesas")
                    .withHolidayType(NATIONAL)
                    .build();

    private final HolidayDefinition assumptionOfMary =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(8, 15))
                    .withEnglishName("Assumption of Mary")
                    .withPolishName("Assunção de Nossa Senhora")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition republicDay =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(10, 5))
                    .withEnglishName("Republic Day")
                    .withPolishName("Implantação da República")
                    .withHolidayType(NATIONAL)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition allSaintsDay =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(11, 1))
                    .withEnglishName("All Saints' Day")
                    .withPolishName("Dia de Todos-os-Santos")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition restorationOfIndependence =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(12, 1))
                    .withEnglishName("Restoration of Independence")
                    .withPolishName("Restauração da Independência")
                    .withHolidayType(NATIONAL)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition immaculateConception =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(12, 8))
                    .withEnglishName("Immaculate Conception")
                    .withPolishName("Imaculada Conceição")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    private final HolidayDefinition christmas =
            HolidayDefinition.newBuilder()
                    .withDate(fixedAtMonthDay(12, 25))
                    .withEnglishName("Christmas")
                    .withPolishName("Natal")
                    .withHolidayType(RELIGIOUS)
                    .markAsPublicHoliday()
                    .build();

    @Override
    public List<HolidayDefinition> holidaysDefinitions() {
        return Arrays.asList(
                newYearsDay,
                carnival,
                goodFriday,
                easter,
                freedomDay,
                labourDay,
                corpusChristi,
                portugalDay,
                assumptionOfMary,
                republicDay,
                allSaintsDay,
                restorationOfIndependence,
                immaculateConception,
                christmas
        );
    }

    @Override
    public int validSinceYearIncluding() {
        return 2000; // maybe
    }
}
