package state

import spock.lang.Specification

class AccountSpec2 extends Specification {
    def "withdraw an amount"() {
        given:
        def account = new Account(5.0)

        when:
        account.withdraw(2.0)

        then:
        account.balance == 3.0
    }

    def "can't withdraw a negative amount"() {
        given:
        def account = new Account(5.0)

        when:
        account.withdraw(-1.0)

        then:
        NegativeAmountWithdrawnException e = thrown()
        e.amount == -1.0
    }
}
