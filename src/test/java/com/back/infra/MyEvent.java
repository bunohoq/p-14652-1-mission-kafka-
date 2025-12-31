package com.back.infra;

import com.back.standard.event.HaveEventName;

public record MyEvent(String msg) implements HaveEventName {
}