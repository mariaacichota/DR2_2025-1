package com.infnet.DR2_TP2.E09;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
    private Queue<String> message = new LinkedList<>();

    public String visualizarProximaMensagem() {
        return message.peek();
    }

    public String obterProximaMensagem() {
        return message.poll();
    }
}