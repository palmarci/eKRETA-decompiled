package p289hu.ekreta.ellenorzo.configSettings;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p054h.p055a.p067b.p104m.C1922c;
import p000a.p054h.p055a.p067b.p104m.C1930g;
import p000a.p054h.p133b.p156q.C2372e;
import p000a.p054h.p133b.p156q.C2373f;
import p000a.p054h.p133b.p156q.C2375h;
import p000a.p054h.p133b.p156q.C2375h.C2377b;
import p000a.p054h.p133b.p156q.C2381l;
import p000a.p054h.p133b.p156q.p157n.C2387e;
import p000a.p054h.p133b.p156q.p157n.C2390f;
import p000a.p054h.p133b.p156q.p157n.C2390f.C2392b;
import p000a.p054h.p159c.C2559k;
import p000a.p054h.p159c.C2561l;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.C4014R;
import p300k.p313b.C5037v;
import p300k.p313b.C5039x;
import p300k.p313b.p316c0.p321e.p327f.C4914a.C4915a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "subscriber", "Lio/reactivex/SingleEmitter;", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "kotlin.jvm.PlatformType", "subscribe"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.configSettings.ConfigurationProvider$getConfiguration$1 */
/* compiled from: ConfigurationProvider.kt */
public final class ConfigurationProvider$getConfiguration$1<T> implements C5039x<T> {

    /* renamed from: a */
    public final /* synthetic */ ConfigurationProvider f11899a;

    public ConfigurationProvider$getConfiguration$1(ConfigurationProvider configurationProvider) {
        this.f11899a = configurationProvider;
    }

    /* renamed from: a */
    public final void mo12319a(final C5037v<Configuration> vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "subscriber");
        final C2373f a = ((C2381l) FirebaseApp.getInstance().mo8249a(C2381l.class)).mo4616a("firebase");
        Intrinsics.checkExpressionValueIsNotNull(a, "FirebaseRemoteConfig.getInstance()");
        C2377b bVar = new C2377b();
        bVar.mo4612a(4200);
        C2375h hVar = new C2375h(bVar, null);
        Intrinsics.checkExpressionValueIsNotNull(hVar, "FirebaseRemoteConfigSett…\n                .build()");
        C3984v.m10131a(a.f5486c, (Callable<TResult>) new C2372e<TResult>(a, hVar));
        String str = "FirebaseRemoteConfig";
        Context context = a.f5484a;
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e(str, "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(C4014R.xml.remote_config_defaults);
                String str2 = null;
                Object obj = null;
                Object obj2 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        str2 = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (obj == null || obj2 == null) {
                                Log.w(str, "An entry in the defaults XML has an invalid key and/or value tag.");
                            } else {
                                hashMap.put(obj, obj2);
                            }
                            obj = null;
                            obj2 = null;
                        }
                        str2 = null;
                    } else if (eventType == 4 && str2 != null) {
                        char c = 65535;
                        int hashCode = str2.hashCode();
                        if (hashCode != 106079) {
                            if (hashCode == 111972721) {
                                if (str2.equals("value")) {
                                    c = 1;
                                }
                            }
                        } else if (str2.equals("key")) {
                            c = 0;
                        }
                        if (c == 0) {
                            obj = xml.getText();
                        } else if (c != 1) {
                            Log.w(str, "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            obj2 = xml.getText();
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException e) {
            Log.e(str, "Encountered an error while parsing the defaults XML file.", e);
        }
        try {
            C2392b a2 = C2390f.m5176a();
            a2.f5531a = new JSONObject(hashMap);
            C2390f a3 = a2.mo4630a();
            C2387e eVar = a.f5489f;
            eVar.mo4626b(a3);
            eVar.mo4622a(a3, false);
        } catch (JSONException e2) {
            Log.e(str, "The provided defaults map could not be processed.", e2);
        }
        a.mo4609a().mo3528a((C1922c<TResult>) new C1922c<Boolean>(this) {

            /* renamed from: a */
            public final /* synthetic */ ConfigurationProvider$getConfiguration$1 f11900a;

            {
                this.f11900a = r1;
            }

            /* renamed from: a */
            public final void mo3524a(C1930g<Boolean> gVar) {
                Intrinsics.checkParameterIsNotNull(gVar, "task");
                if (gVar.mo3546d()) {
                    C2559k a = new C2561l().mo4835a();
                    Type b = new C4111xed26eb24().mo4798b();
                    C5037v vVar = vVar;
                    String a2 = a.mo4610a("privacyPolicyUrl");
                    Intrinsics.checkExpressionValueIsNotNull(a2, "remoteConfig.getString(\"privacyPolicyUrl\")");
                    String a3 = a.mo4610a("privacyPolicyUpdateDate");
                    Intrinsics.checkExpressionValueIsNotNull(a3, "remoteConfig.getString(\"privacyPolicyUpdateDate\")");
                    String a4 = a.mo4610a("latestVersion");
                    Intrinsics.checkExpressionValueIsNotNull(a4, "remoteConfig.getString(\"latestVersion\")");
                    int parseInt = Integer.parseInt(a4);
                    String a5 = a.mo4610a("minimumSupportedVersion");
                    Intrinsics.checkExpressionValueIsNotNull(a5, "remoteConfig.getString(\"minimumSupportedVersion\")");
                    int parseInt2 = Integer.parseInt(a5);
                    String a6 = a.mo4610a("androidMobileStoreUrl");
                    Intrinsics.checkExpressionValueIsNotNull(a6, "remoteConfig.getString(\"androidMobileStoreUrl\")");
                    String a7 = a.mo4610a("iOSMobileStoreUrl");
                    Intrinsics.checkExpressionValueIsNotNull(a7, "remoteConfig.getString(\"iOSMobileStoreUrl\")");
                    String a8 = a.mo4610a("androidMobileTeacherStoreUrl");
                    Intrinsics.checkExpressionValueIsNotNull(a8, "remoteConfig.getString(\"…idMobileTeacherStoreUrl\")");
                    String a9 = a.mo4610a("iOSMobileTeacherStoreUrl");
                    Intrinsics.checkExpressionValueIsNotNull(a9, "remoteConfig.getString(\"iOSMobileTeacherStoreUrl\")");
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(a.mo4610a("blacklistPlatformByMobileBuildVersion"));
                    long a10 = this.f11900a.f11899a.mo12316a();
                    String b2 = this.f11900a.f11899a.mo12317b();
                    Object a11 = a.mo4830a(a.mo4610a("powerSaverManagerAppsByManufacturer"), b);
                    Intrinsics.checkExpressionValueIsNotNull(a11, "gson.fromJson<List<Power…                        )");
                    Configuration configuration = new Configuration(a2, a3, parseInt, parseInt2, a6, a7, a8, a9, listOf, 0, a10, b2, (List) a11);
                    ((C4915a) vVar).mo17115a(configuration);
                    return;
                }
                ConfigurationProvider.access$getLogger$p(this.f11900a.f11899a).mo115b("Fetch failed. Settings default config params.");
                ((C4915a) vVar).mo17116a((Throwable) new RuntimeException("Fetching Firebase configuration failed."));
            }
        });
    }
}
