package p289hu.ekreta.ellenorzo.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.security.InvalidParameterException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p238i.p239e.C3531i;
import p211h.p238i.p239e.C3535m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.main.MainActivity;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Event;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4991d;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5036u;
import p300k.p313b.p315b0.C4670c;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010#\u001a\u00020\u00152\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0%H\u0016J(\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationStrategyImpl;", "Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "notificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "context", "Landroid/content/Context;", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "firebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "(Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/notification/NotificationRepository;Landroid/content/Context;Landroidx/core/app/NotificationManagerCompat;Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "createLoginNotification", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "createNotification", "pushMessage", "Lhu/ekreta/ellenorzo/notification/PushMessage;", "getNotificationChannel", "", "messageType", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "getPendingIntent", "Landroid/app/PendingIntent;", "getProfileByMessageRecipient", "Lio/reactivex/Single;", "handleIncomingNotification", "messageMap", "", "showNotification", "channelId", "text", "pendingIntent", "notificationId", "", "updateFirebaseToken", "newToken", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl */
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl implements NotificationStrategy {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f14261g = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NotificationStrategyImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: a */
    public final Lazy f14262a = LazyKt__LazyJVMKt.lazy(NotificationStrategyImpl$logger$2.INSTANCE);

    /* renamed from: b */
    public final ProfileRepository f14263b;

    /* renamed from: c */
    public final NotificationRepository f14264c;

    /* renamed from: d */
    public final Context f14265d;

    /* renamed from: e */
    public final C3535m f14266e;

    /* renamed from: f */
    public final FirebaseContainer f14267f;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14268a = new int[NotificationMessageRole.values().length];

        /* renamed from: b */
        public static final /* synthetic */ int[] f14269b = new int[NotificationMessageType.values().length];

        static {
            f14268a[NotificationMessageRole.ALL.ordinal()] = 1;
            f14269b[NotificationMessageType.OMISSION.ordinal()] = 1;
            f14269b[NotificationMessageType.EVALUATION.ordinal()] = 2;
            f14269b[NotificationMessageType.NOTE.ordinal()] = 3;
            f14269b[NotificationMessageType.MESSAGE.ordinal()] = 4;
            f14269b[NotificationMessageType.HOMEWORK.ordinal()] = 5;
            f14269b[NotificationMessageType.EXAM.ordinal()] = 6;
            f14269b[NotificationMessageType.ALL.ordinal()] = 7;
        }
    }

    public NotificationStrategyImpl(ProfileRepository profileRepository, NotificationRepository notificationRepository, Context context, C3535m mVar, FirebaseContainer firebaseContainer) {
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(notificationRepository, "notificationRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(mVar, "notificationManager");
        Intrinsics.checkParameterIsNotNull(firebaseContainer, "firebaseContainer");
        this.f14263b = profileRepository;
        this.f14264c = notificationRepository;
        this.f14265d = context;
        this.f14266e = mVar;
        this.f14267f = firebaseContainer;
    }

    public static final /* synthetic */ C5620b access$getLogger$p(NotificationStrategyImpl notificationStrategyImpl) {
        Lazy lazy = notificationStrategyImpl.f14262a;
        KProperty kProperty = f14261g[0];
        return (C5620b) lazy.getValue();
    }

    public static final /* synthetic */ String access$getNotificationChannel(NotificationStrategyImpl notificationStrategyImpl, NotificationMessageType notificationMessageType) {
        String str;
        String str2;
        Context context = notificationStrategyImpl.f14265d;
        if (VERSION.SDK_INT < 26) {
            return NotificationChannelId.DEFAULT.mo13745a();
        }
        switch (WhenMappings.f14269b[notificationMessageType.ordinal()]) {
            case 1:
                str = NotificationChannelId.OMISSION.mo13745a();
                str2 = context.getString(C4014R.string.omission_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.omiss…_notification_channel_id)");
                break;
            case 2:
                str = NotificationChannelId.EVALUTION.mo13745a();
                str2 = context.getString(C4014R.string.evaluation_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.evalu…_notification_channel_id)");
                break;
            case 3:
                str = NotificationChannelId.NOTE.mo13745a();
                str2 = context.getString(C4014R.string.note_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.note_notification_channel_id)");
                break;
            case 4:
                str = NotificationChannelId.MESSAGE.mo13745a();
                str2 = context.getString(C4014R.string.message_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.messa…_notification_channel_id)");
                break;
            case 5:
                str = NotificationChannelId.HOMEWORK.mo13745a();
                str2 = context.getString(C4014R.string.homework_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.homew…_notification_channel_id)");
                break;
            case 6:
                str = NotificationChannelId.EXAM.mo13745a();
                str2 = context.getString(C4014R.string.exam_notification_channel_id);
                Intrinsics.checkExpressionValueIsNotNull(str2, "getString(R.string.exam_notification_channel_id)");
                break;
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append("messageType is not valid. MessageType ");
                sb.append(notificationMessageType);
                throw new InvalidParameterException(sb.toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 3);
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            return str;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    /* renamed from: a */
    public void mo13790a(Map<String, String> map) {
        C5027n nVar;
        Intrinsics.checkParameterIsNotNull(map, "messageMap");
        FirebaseContainer firebaseContainer = this.f14267f;
        Pair[] pairArr = new Pair[2];
        StringBuilder sb = new StringBuilder();
        String str = (String) map.get("InstituteCode");
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append("#");
        String str3 = (String) map.get("UserId");
        if (str3 == null) {
            str3 = "0";
        }
        sb.append(str3);
        pairArr[0] = TuplesKt.m17868to(Param.PROFILE, sb.toString());
        String str4 = (String) map.get("NotificationType");
        if (str4 == null) {
            str4 = str2;
        }
        pairArr[1] = TuplesKt.m17868to(Param.PUSH_TYPE, str4);
        firebaseContainer.mo16332a(Event.NOTIFICATION_RECEIVE, C3158a.m7816a((Pair<String, ? extends Object>[]) pairArr));
        PushMessage a = PushMessage.Companion.mo13811a(map);
        if (WhenMappings.f14268a[a.mo13805c().ordinal()] != 1) {
            nVar = this.f14263b.mo14189a(a.mo13803a(), a.mo13807e());
        } else {
            nVar = this.f14263b.mo14192b(a.mo13803a(), a.mo13807e());
        }
        C5036u e = nVar.mo17239d().mo17269e(NotificationStrategyImpl$getProfileByMessageRecipient$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(e, "when (pushMessage.notifi…rror().map { it.first() }");
        C4998b.m16843a(e, (Function1<? super Throwable, Unit>) new NotificationStrategyImpl$createNotification$2<Object,Unit>(this, a), (Function1<? super T, Unit>) new NotificationStrategyImpl$createNotification$1<Object,Unit>(this, a));
    }

    /* renamed from: a */
    public void mo13789a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "newToken");
        C5027n.m16892a((C5030q<? extends T1>) this.f14263b.mo14187a().mo17246g(NotificationStrategyImpl$updateFirebaseToken$1.INSTANCE), (C5030q<? extends T2>) this.f14264c.mo13757f(), (C4670c<? super T1, ? super T2, ? extends R>) NotificationStrategyImpl$updateFirebaseToken$2.INSTANCE).mo17239d().mo17263b((C4675h<? super T, ? extends C4991d>) new NotificationStrategyImpl$updateFirebaseToken$3<Object,Object>(this, str)).mo16982c();
    }

    /* renamed from: a */
    public final void mo13793a(String str, String str2, PendingIntent pendingIntent, int i) {
        C3531i iVar = new C3531i(this.f14265d, str);
        iVar.f9781O.icon = C4014R.mipmap.ic_launcher;
        iVar.mo10206b(this.f14265d.getString(C4014R.string.new_message_arrived));
        iVar.mo10204a((CharSequence) str2);
        iVar.f9795l = 0;
        iVar.f9767A = "msg";
        iVar.f9789f = pendingIntent;
        iVar.mo10205a(true);
        this.f14266e.mo10210a(i, iVar.mo10201a());
    }

    /* renamed from: a */
    public final void mo13792a(Profile profile) {
        String a = NotificationChannelId.GENERAL.mo13745a();
        String string = this.f14265d.getString(C4014R.string.Settings_Push_Registration_Login_To_Renew, new Object[]{profile.mo14040D()});
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …le.userName\n            )");
        mo13793a(a, string, mo13791a(profile, NotificationMessageType.ALL), profile.mo14054m().hashCode());
    }

    /* renamed from: a */
    public final PendingIntent mo13791a(Profile profile, NotificationMessageType notificationMessageType) {
        Context context = this.f14265d;
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(268468224);
        ExtensionsKt.m14663b(intent, profile.mo14054m());
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageTypeObject");
        ExtensionsKt.f15290n.setValue(intent, ExtensionsKt.f15277a[12], notificationMessageType);
        intent.setAction(String.valueOf(System.currentTimeMillis()));
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 0);
        Intrinsics.checkExpressionValueIsNotNull(activity, "PendingIntent.getActivity(this, 0, intent, 0)");
        return activity;
    }
}
