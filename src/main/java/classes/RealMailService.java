package classes;

import interfaces.MailService;
import interfaces.Sendable;

public class RealMailService implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
