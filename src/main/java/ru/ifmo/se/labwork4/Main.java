package ru.ifmo.se.labwork4;

import ru.ifmo.se.labwork4.basic.Animal;
import ru.ifmo.se.labwork4.basic.Entity;
import ru.ifmo.se.labwork4.basic.Head;
import ru.ifmo.se.labwork4.basic.Leg;
import ru.ifmo.se.labwork4.exception.NatureException;
import ru.ifmo.se.labwork4.model.*;
import ru.ifmo.se.labwork4.status.StatusOfOpinion;
import ru.ifmo.se.labwork4.status.StatusOfSpeaker;
import ru.ifmo.se.labwork4.status.StatusOfSpeed;

public class Main {
    public static void main(String[] args) {
        //Creating objects
        var pirateLeg = new PirateLeg("leg");
        var pot = new Pot("горшочек", "М и о т");
        var chair = new Chair("стул");
        var homeW = new HomeW("Дом Винни");
        var homeP = new HomeP("Дом Пяточка");
        try {
            var winnieThePooh = new WinnieThePooh("Винни", "Пух", pirateLeg);
        }
        catch (NatureException e){
            e.printStackTrace();
            System.out.println("Зачем же уродовать Винни Пуха?");
        }

        var winnieThePooh = new WinnieThePooh("Винни", "Пух", new Muzzle("мордочка"));
        var piglet = new Piglet("Пятачок");
        var honey = new Honey("мёд");
        var veryDeepHole = new VeryDeepHole("Очень Глубокая Яма");
        var trap = new Trap("западня");
        var lickGood = new Statement("Винни как следует лизнул", true);
        var itIsEverything = new Statement("Это все что у него осталось", true);
        var trickyPiglet = new Statement("если они будут класть в ловушку желуди, то желуди придется собирать ему, Пятачку, а если они положат туда мед, то его достанет Пух", true);
        //Setting the scene
        pot.fill(honey);
        veryDeepHole.fill(piglet);
        homeW.getShelf().fill(pot);
        //Action
        winnieThePooh.dream(honey);
        winnieThePooh.wakeUp();
        winnieThePooh.jump();
        winnieThePooh.say("Мед гораздо приманочней, чем желуди");
        piglet.express(StatusOfOpinion.OTHER);
        piglet.understand(trickyPiglet);
        piglet.say("Очень хорошо, значит, мед!");
        winnieThePooh.think(new Entity() {
            @Override
            public String getName() {
                return "это";
            }
        });
        winnieThePooh.say("Очень хорошо, значит, желуди", StatusOfSpeaker.DELAY);
        winnieThePooh.goTo(homeW);
        winnieThePooh.goTo(homeW.getShelf());
        winnieThePooh.climb(chair);
        winnieThePooh.get(homeW.getShelf());
        winnieThePooh.lookIntoPot(pot);
        winnieThePooh.shove(pot, winnieThePooh.getHead());
        winnieThePooh.lick(pot);
        winnieThePooh.process(lickGood);
        winnieThePooh.carry(pot, trap);
        piglet.lookOut(veryDeepHole);
        piglet.say("Принес?", StatusOfSpeaker.PUZZLED);
        winnieThePooh.say("Да, но он " + pot.getFullness().toString());
        piglet.lookInto(pot);
        piglet.say("Это все, что у тебя осталось?", StatusOfSpeaker.PUZZLED);
        winnieThePooh.process(itIsEverything);
        winnieThePooh.say("Да.");
        piglet.put(veryDeepHole, pot);
        piglet.goTo(homeP, StatusOfSpeed.FAST);
        homeP.getBoard();
        winnieThePooh.sleep();
    }
}
