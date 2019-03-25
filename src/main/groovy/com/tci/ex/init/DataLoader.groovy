package com.tci.ex.init

import com.tci.ex.service.BookService
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.micronaut.context.annotation.Requires
import io.micronaut.context.env.Environment
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent
import org.slf4j.*;
import javax.inject.Inject
import javax.inject.Singleton

//tag::class[]
@CompileStatic
@Singleton // <1>
@Requires(notEnv = Environment.TEST) // <2>
class DataLoader implements ApplicationEventListener<ServerStartupEvent> { // <3>

   private static final Logger log = LoggerFactory.getLogger(DataLoader.class);
    final BookService bookService

    @Inject
    DataLoader(BookService bookService) {
        this.bookService = bookService
    }

    @Override
    void onApplicationEvent(ServerStartupEvent event) { // <4>
        if (bookService.count() == 0) {
            log.info "Here in autoload"
            // log.debug "Loading sample data"
            bookService.save("IBNF1111", "Call of the Wild")
            bookService.save("IBNF2222", "Daemon")
            bookService.save("IBNF3333", "Freedom")
            bookService.save("IBNF4444", "Kill Decision")
            log.info "Here in autoload DONE"
        }

    }
}
//end::class[]
