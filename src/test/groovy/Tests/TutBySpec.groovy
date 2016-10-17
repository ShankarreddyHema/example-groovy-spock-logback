package Tests

import Pages.TutMainPage
import geb.spock.GebReportingSpec;

public class TutBySpec extends GebReportingSpec {
    def "Tut Main page authorization"() {
        when:
        def tutMainPage = to TutMainPage
        tutMainPage.login("kvadr99@tut.by", "EpamForever")

        then:
        waitFor {
            tutMainPage.spanUserName.text() == "Екатерина Юрасова"
        }
    }
}
