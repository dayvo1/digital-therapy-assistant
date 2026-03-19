package com.digitaltherapy.cli.commands.cbt;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.digitaltherapy.cli.Command;
import com.digitaltherapy.cli.MenuHandler;
import com.digitaltherapy.cli.commands.BackCommand;

@Component
public class CBTSessionsMenuCommand implements Command {
    private MenuHandler cbtMenuHandler;

    public CBTSessionsMenuCommand(
        StartNewSessionCommand startSessionCommand,
        ViewSessionHistoryCommand viewSessionHistoryCommand,
        ViewSessionLibraryCommand viewSessionLibraryCommand,
        BackCommand backCommand
    ){
        cbtMenuHandler = new MenuHandler(
            List.of(startSessionCommand, 
                viewSessionHistoryCommand, viewSessionLibraryCommand,
                backCommand));
    }
    
    public String getName() { return "2"; }
    public String getMenuLabel() { return "CBT Sessions"; }
    
    public void execute(Scanner in) { 
        cbtMenuHandler.runMenu("CBT Menu", in);
    }
}
