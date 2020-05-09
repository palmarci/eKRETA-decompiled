package p289hu.ekreta.ellenorzo.message;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import p289hu.ekreta.ellenorzo.message.Message.MessageType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/message/Message$MessageType;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.Message$MessageType$Companion$map$2 */
/* compiled from: Message.kt */
public final class Message$MessageType$Companion$map$2 extends Lambda implements Function0<Map<Long, ? extends MessageType>> {
    public static final Message$MessageType$Companion$map$2 INSTANCE = new Message$MessageType$Companion$map$2();

    public Message$MessageType$Companion$map$2() {
        super(0);
    }

    public final Map<Long, MessageType> invoke() {
        MessageType[] values = MessageType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(values.length), 16));
        for (MessageType messageType : values) {
            linkedHashMap.put(Long.valueOf(messageType.mo13302a()), messageType);
        }
        return linkedHashMap;
    }
}
