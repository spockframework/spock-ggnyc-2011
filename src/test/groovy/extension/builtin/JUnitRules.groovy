package extension.builtin

import spock.lang.Specification
import org.junit.rules.TestName
import org.junit.Rule
import org.junit.rules.TemporaryFolder

class JUnitRules extends Specification {
    @Rule tempFolder = new TemporaryFolder()
    File file

    def "some file-based test"() {
        when:
        file = tempFolder.newFile("Philly")

        then:
        file.exists()
    }

    def cleanup() {
        assert !file.exists()
    }
}
