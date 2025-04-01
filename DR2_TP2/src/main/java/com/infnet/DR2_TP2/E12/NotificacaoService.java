package com.infnet.DR2_TP2.E12;

public class NotificacaoService {

    public enum TipoNotificacao {
        EMAIL {
            @Override
            public void enviar() {
                System.out.println("Enviando e-mail...");
            }
        },
        SMS {
            @Override
            public void enviar() {
                System.out.println("Enviando SMS...");
            }
        },
        PUSH {
            @Override
            public void enviar() {
                System.out.println("Enviando notificação push...");
            }
        };

        public abstract void enviar();
    }

    public void enviarNotificacao(TipoNotificacao tipo) {
        tipo.enviar();
    }
}
