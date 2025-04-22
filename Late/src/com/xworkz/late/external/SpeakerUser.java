package com.xworkz.late.external;

import com.xworkz.late.internal.Speaker;

public class SpeakerUser {
    Speaker speaker;

    public SpeakerUser(Speaker speaker) {
        this.speaker = speaker;
    }

    public void execute() {
        if (speaker != null) {
            System.out.println("checking null");
            speaker.playSound();
        }
    }
}
