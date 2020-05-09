package p289hu.ekreta.ellenorzo.util;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C2897d0;
import androidx.recyclerview.widget.RecyclerView.C2900g;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p211h.p271p.C3824r;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.homework.Homework;
import p289hu.ekreta.ellenorzo.message.Message;
import p289hu.ekreta.ellenorzo.notes.Note;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;
import p289hu.ekreta.ellenorzo.notification.NotificationMessageType;
import p289hu.ekreta.ellenorzo.omission.Omission;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectParameters;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p300k.p313b.C5027n;
import p300k.p313b.p314a0.C4662b;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4676i;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4827h;
import p300k.p313b.p338z.p339a.C5041a;
import p300k.p340c.C5074f0;
import p300k.p340c.C5179y;
import p365o.p372c.p373a.C5636a;
import p365o.p372c.p373a.C5639d;
import p365o.p372c.p373a.p375p.C5664a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000¨\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010\u0001\u001ac\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0007\u0012\u0005\u0018\u0001H\u00010\u0001\"\u0007\b\u0000\u0010\u0001\u0018\u00012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u0001H\u00012*\b\u0004\u0010\u0001\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u000202\u0012\u0005\u0012\u0003H\u0001\u0012\u0005\u0012\u00030\u00010\u0001¢\u0006\u0003\b\u0001H\b¢\u0006\u0003\u0010\u0001\u001a)\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010$0\u00012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010$¢\u0006\u0003\u0010\u0001\u001a<\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0007\u0012\u0005\u0018\u0001H\u00010\u0001\"\f\b\u0000\u0010\u0001\u0018\u0001*\u00030\u00012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u0001H\u0001H\b¢\u0006\u0003\u0010\u0001\u001aB\u0010\u0001\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000b\u0012\u0005\u0012\u0003H\u0001\u0018\u00010[0\u0001\"\f\b\u0000\u0010\u0001\u0018\u0001*\u00030\u00012\u0012\b\u0002\u0010\u0001\u001a\u000b\u0012\u0005\u0012\u0003H\u0001\u0018\u00010[H\b\u001a\u001b\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010\u0001\u001a\u001a\u0010 \u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010¡\u0001\u001a<\u0010¢\u0001\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0007\u0012\u0005\u0018\u0001H\u00010\u0001\"\f\b\u0000\u0010\u0001\u0018\u0001*\u00030£\u00012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u0001H\u0001H\b¢\u0006\u0003\u0010¤\u0001\u001aJ\u0010¥\u0001\u001a\u00030¦\u00012\t\b\u0002\u0010§\u0001\u001a\u00020\u00012\t\b\u0002\u0010¨\u0001\u001a\u00020\u00012\t\b\u0002\u0010©\u0001\u001a\u00020\u00012\t\b\u0002\u0010ª\u0001\u001a\u00020\u00012\t\b\u0002\u0010«\u0001\u001a\u00020\u00012\t\b\u0002\u0010¬\u0001\u001a\u00020\u0001\u001a#\u0010­\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001020\u00012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u000102\u001a\u0011\u0010®\u0001\u001a\u00020\u00012\b\u0010¯\u0001\u001a\u00030\u0001\u001a\u0019\u0010°\u0001\u001a\u00020\u00012\n\u0010¯\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0003\u0010±\u0001\u001a1\u0010²\u0001\u001a\u00030\u0001\"\u0005\b\u0000\u0010\u0001*\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003H\u00010[0³\u00012\u000e\u0010´\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00010[\u001a\f\u0010µ\u0001\u001a\u000202*\u00030¶\u0001\u001a.\u0010·\u0001\u001a\u0011\u0012\u0005\u0012\u00030¸\u0001\u0012\u0005\u0012\u00030\u00010\u0001*\u00030¹\u00012\u0007\u0010º\u0001\u001a\u0002022\b\u0010\u0001\u001a\u00030\u0001\u001a)\u0010»\u0001\u001a\t\u0012\u0005\u0012\u0003H¼\u00010[\"\u0005\b\u0000\u0010¼\u0001*\f\u0012\u0007\u0012\u0005\u0018\u00010¸\u00010½\u0001¢\u0006\u0003\u0010¾\u0001\u001a\u0017\u0010¿\u0001\u001a\u00030\u0001*\u00030À\u00012\b\u0010Á\u0001\u001a\u00030Â\u0001\u001a3\u0010Ã\u0001\u001a\n\u0012\u0005\u0012\u0003HÅ\u00010Ä\u0001\"\u0005\b\u0000\u0010Å\u0001*\u00030Æ\u00012\u0016\u0010Ç\u0001\u001a\u0011\u0012\u0005\u0012\u00030É\u0001\u0012\u0005\u0012\u0003HÅ\u00010È\u0001\u001aJ\u0010Ê\u0001\u001a,\u0012\u000e\u0012\f ;*\u0005\u0018\u0001HË\u0001HË\u0001 ;*\u0015\u0012\u000e\u0012\f ;*\u0005\u0018\u0001HË\u0001HË\u0001\u0018\u00010Ä\u00010Ä\u0001\"\u0005\b\u0000\u0010Ë\u0001*\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003HË\u00010[0Ä\u0001\u001a\u0016\u0010Ì\u0001\u001a\u000202*\u00030Í\u00012\b\u0010Î\u0001\u001a\u00030Ï\u0001\u001a\u0015\u0010Ð\u0001\u001a\u00020<*\u00020\u00012\b\u0010Ñ\u0001\u001a\u00030Ò\u0001\u001a(\u0010Ó\u0001\u001a\u0003H\u0001\"\n\b\u0000\u0010\u0001*\u00030Ô\u0001*\u00020\u00012\b\u0010Ñ\u0001\u001a\u00030Ò\u0001¢\u0006\u0003\u0010Õ\u0001\u001a\r\u0010Ö\u0001\u001a\u00030\u0001*\u00030×\u0001\u001aH\u0010Ø\u0001\u001a\u00030\u0001*\u00030Ù\u00012(\u0010Ú\u0001\u001a#\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030Ü\u0001\u0012\u0005\u0012\u00030\u00010È\u0001j\u0003`Ý\u0001¢\u0006\u0003\b\u00010Û\u00012\u000f\u0010Þ\u0001\u001a\n\u0012\u0005\u0012\u00030Ü\u00010ß\u0001\u001a\u0014\u0010à\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010Ä\u0001*\u00030á\u0001\u001a2\u0010â\u0001\u001a\u0005\u0018\u0001H\u0001\"\f\b\u0000\u0010\u0001\u0018\u0001*\u00030¸\u0001*\u0003H\u00012\n\u0010ã\u0001\u001a\u0005\u0018\u0001H\u0001H\f¢\u0006\u0003\u0010ä\u0001\u001a\u001a\u0010å\u0001\u001a\u00030æ\u0001*\u00030¦\u00012\b\u0010ã\u0001\u001a\u00030¦\u0001H\u0002\u001a\u0018\u0010ç\u0001\u001a\u00030\u0001*\u00030è\u00012\t\u0010é\u0001\u001a\u0004\u0018\u000102\u001a\u0018\u0010ê\u0001\u001a\u00030\u0001*\u00030è\u00012\t\u0010é\u0001\u001a\u0004\u0018\u000102\u001ah\u0010ë\u0001\u001a\u00030\u0001\"\u0005\b\u0000\u0010ì\u0001\"\u0013\b\u0001\u0010í\u0001*\f\u0012\u0007\b\u0000\u0012\u0003Hì\u00010î\u0001*\u00030ï\u00012\b\u0010ð\u0001\u001a\u00030Ù\u00012\u0015\u0010ñ\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003Hì\u00010[0Û\u00012\u001c\u0010ò\u0001\u001a\u0017\u0012\u0005\u0012\u00030Ò\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0005\u0012\u0003Hí\u00010ó\u0001\u001ab\u0010ë\u0001\u001a\u00030\u0001\"\u0005\b\u0000\u0010ì\u0001\"\u0013\b\u0001\u0010í\u0001*\f\u0012\u0007\b\u0000\u0012\u0003Hì\u00010î\u0001*\u00030ï\u00012\b\u0010ð\u0001\u001a\u00030Ù\u00012\u0015\u0010ñ\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003Hì\u00010[0Û\u00012\u0016\u0010ô\u0001\u001a\u0011\u0012\u0005\u0012\u0003Hì\u0001\u0012\u0005\u0012\u0003Hí\u00010õ\u0001\u001a*\u0010ë\u0001\u001a\u00030\u0001\"\n\b\u0000\u0010í\u0001*\u00030ö\u0001*\u00030ï\u00012\u000f\u0010ô\u0001\u001a\n\u0012\u0005\u0012\u0003Hí\u00010÷\u0001\u001aW\u0010ë\u0001\u001a\u00030\u0001\"\u0005\b\u0000\u0010ì\u0001\"\u0013\b\u0001\u0010í\u0001*\f\u0012\u0007\b\u0000\u0012\u0003Hì\u00010î\u0001*\u00030ï\u00012\u000e\u0010ñ\u0001\u001a\t\u0012\u0005\u0012\u0003Hì\u00010[2\u001c\u0010ò\u0001\u001a\u0017\u0012\u0005\u0012\u00030Ò\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0005\u0012\u0003Hí\u00010ó\u0001\u001aF\u0010ø\u0001\u001a\t\u0012\u0005\u0012\u0003Hù\u00010[\"\u0005\b\u0000\u0010ù\u0001*\n\u0012\u0005\u0012\u0003Hù\u00010ú\u00012\u0015\u0010û\u0001\u001a\u0010\u0012\u0005\u0012\u0003Hù\u0001\u0012\u0004\u0012\u0002020ü\u00012\f\b\u0002\u0010ý\u0001\u001a\u0005\u0018\u00010þ\u0001\u001a0\u0010ÿ\u0001\u001a\u0012\u0012\u0005\u0012\u00030¸\u0001\u0012\u0006\u0012\u0004\u0018\u0001020\u0001*\u00030¹\u00012\u0007\u0010º\u0001\u001a\u0002022\t\u0010\u0001\u001a\u0004\u0018\u000102\u001a\u000b\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\u0016\u0010\u0002\u001a\f ;*\u0005\u0018\u00010\u00020\u0002*\u00030\u0002\u001a<\u0010\u0002\u001a\u00030\u0001\"\u0005\b\u0000\u0010\u0001*\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003H\u00010[0³\u00012\b\u0010\u0002\u001a\u0003H\u00012\t\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010\u0002\u001a\u0016\u0010\u0002\u001a\u000202*\u0002022\t\b\u0002\u0010\u0002\u001a\u000202\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"3\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"3\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000f8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\"3\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00168F@FX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\"3\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d8F@FX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\"3\u0010%\u001a\u0004\u0018\u00010$*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010$8F@FX\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\"3\u0010,\u001a\u0004\u0018\u00010+*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010+8F@FX\u0002¢\u0006\u0012\n\u0004\b1\u0010\u000e\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\"3\u00103\u001a\u0004\u0018\u000102*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u0001028F@FX\u0002¢\u0006\u0012\n\u0004\b8\u0010\u000e\u001a\u0004\b4\u00105\"\u0004\b6\u00107\"\u001d\u00109\u001a\n ;*\u0004\u0018\u00010:0:*\u00020<8F¢\u0006\u0006\u001a\u0004\b=\u0010>\"3\u0010@\u001a\u0004\u0018\u00010?*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010?8F@FX\u0002¢\u0006\u0012\n\u0004\bE\u0010\u000e\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\"3\u0010G\u001a\u0004\u0018\u00010F*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010F8F@FX\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000e\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\"3\u0010N\u001a\u0004\u0018\u00010M*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010M8F@FX\u0002¢\u0006\u0012\n\u0004\bS\u0010\u000e\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R\"3\u0010U\u001a\u0004\u0018\u00010T*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010T8F@FX\u0002¢\u0006\u0012\n\u0004\bZ\u0010\u000e\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y\"?\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[*\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[8F@FX\u0002¢\u0006\u0012\n\u0004\bb\u0010\u000e\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a\"3\u0010c\u001a\u0004\u0018\u00010\\*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\\8F@FX\u0002¢\u0006\u0012\n\u0004\bh\u0010\u000e\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g\"\u0017\u0010i\u001a\u000202*\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\bj\u0010k\"\u0017\u0010l\u001a\u000202*\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\bm\u0010k\"3\u0010n\u001a\u0004\u0018\u000102*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u0001028F@FX\u0002¢\u0006\u0012\n\u0004\bq\u0010\u000e\u001a\u0004\bo\u00105\"\u0004\bp\u00107\"3\u0010s\u001a\u0004\u0018\u00010r*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010r8F@FX\u0002¢\u0006\u0012\n\u0004\bx\u0010\u000e\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w\"3\u0010z\u001a\u0004\u0018\u00010y*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010y8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0010\u000e\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~\";\u0010\u0001\u001a\u0005\u0018\u00010\u0001*\u00020\b2\t\u0010\u0005\u001a\u0005\u0018\u00010\u00018F@FX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010\u000e\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001\"7\u0010\u0001\u001a\u0004\u0018\u000102*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u0001028F@FX\u0002¢\u0006\u0015\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u00105\"\u0005\b\u0001\u00107¨\u0006\u0002"}, mo17463d2 = {"booleanFalseValue", "", "booleanNullValue", "booleanTrueValue", "intNullValue", "<set-?>", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "announcedTestObject", "Landroid/content/Intent;", "getAnnouncedTestObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "setAnnouncedTestObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;)V", "announcedTestObject$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "caseDetailParameter", "getCaseDetailParameter", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "setCaseDetailParameter", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;)V", "caseDetailParameter$delegate", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "caseObject", "getCaseObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/BaseCase;", "setCaseObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/cases/BaseCase;)V", "caseObject$delegate", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "evaluationObject", "getEvaluationObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "setEvaluationObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "evaluationObject$delegate", "", "homeworkId", "getHomeworkId", "(Landroid/content/Intent;)Ljava/lang/Long;", "setHomeworkId", "(Landroid/content/Intent;Ljava/lang/Long;)V", "homeworkId$delegate", "Lhu/ekreta/ellenorzo/homework/Homework;", "homeworkObject", "getHomeworkObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/homework/Homework;", "setHomeworkObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/homework/Homework;)V", "homeworkObject$delegate", "", "instituteCode", "getInstituteCode", "(Landroid/content/Intent;)Ljava/lang/String;", "setInstituteCode", "(Landroid/content/Intent;Ljava/lang/String;)V", "instituteCode$delegate", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "getLayoutInflater", "(Landroid/view/View;)Landroid/view/LayoutInflater;", "Lhu/ekreta/ellenorzo/message/Message;", "messageObject", "getMessageObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/message/Message;", "setMessageObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/message/Message;)V", "messageObject$delegate", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "messageTypeObject", "getMessageTypeObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "setMessageTypeObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/notification/NotificationMessageType;)V", "messageTypeObject$delegate", "Lhu/ekreta/ellenorzo/notes/Note;", "noteObject", "getNoteObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notes/Note;", "setNoteObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/notes/Note;)V", "noteObject$delegate", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "noticeBoardItemObject", "getNoticeBoardItemObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "setNoticeBoardItemObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;)V", "noticeBoardItemObject$delegate", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "omissionList", "getOmissionList", "(Landroid/content/Intent;)Ljava/util/List;", "setOmissionList", "(Landroid/content/Intent;Ljava/util/List;)V", "omissionList$delegate", "omissionObject", "getOmissionObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/omission/Omission;", "setOmissionObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/omission/Omission;)V", "omissionObject$delegate", "orDefault", "getOrDefault", "(Ljava/lang/String;)Ljava/lang/String;", "orHyphen", "getOrHyphen", "profileId", "getProfileId", "setProfileId", "profileId$delegate", "Lhu/ekreta/ellenorzo/profile/Profile;", "profileObject", "getProfileObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/profile/Profile;", "setProfileObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/profile/Profile;)V", "profileObject$delegate", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "subjectParameters", "getSubjectParameters", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "setSubjectParameters", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;)V", "subjectParameters$delegate", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "timeTableItemDetailParameter", "getTimeTableItemDetailParameter", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "setTimeTableItemDetailParameter", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/timetable/TimeTableItem;)V", "timeTableItemDetailParameter$delegate", "timeTableItemUid", "getTimeTableItemUid", "setTimeTableItemUid", "timeTableItemUid$delegate", "intIntentExtraAsProperty", "Lkotlin/properties/ReadWriteProperty;", "defaultValue", "(Ljava/lang/Integer;)Lkotlin/properties/ReadWriteProperty;", "intentExtraAsProperty", "T", "put", "Lkotlin/Function3;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "longIntentExtraAsProperty", "(Ljava/lang/Long;)Lkotlin/properties/ReadWriteProperty;", "parcelableIntentExtraAsProperty", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)Lkotlin/properties/ReadWriteProperty;", "parcelableListIntentExtraAsProperty", "readNullableParcelableIntToBoolean", "", "value", "(Ljava/lang/Integer;)Ljava/lang/Boolean;", "readNullableParcelableIntToInt", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "serializableIntentExtraAsProperty", "Ljava/io/Serializable;", "(Ljava/io/Serializable;)Lkotlin/properties/ReadWriteProperty;", "setTimeInCalendar", "Ljava/util/Calendar;", "year", "month", "day", "hourOfDay", "minute", "second", "stringIntentExtraAsProperty", "writeBoolToParcel", "enabled", "writeNullableBoolToParcel", "(Ljava/lang/Boolean;)I", "addAll", "Landroidx/lifecycle/MutableLiveData;", "newValues", "asString", "Lorg/threeten/bp/LocalDate;", "booleanPref", "", "Landroid/content/SharedPreferences;", "key", "cast", "TItemType", "", "([Ljava/lang/Object;)Ljava/util/List;", "disposeWith", "Lio/reactivex/disposables/Disposable;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "executeTransaction", "Lio/reactivex/Observable;", "R", "Lio/realm/RealmModel;", "transaction", "Lkotlin/Function1;", "Lio/realm/Realm;", "firstOrEmpty", "TModel", "getFileName", "Landroid/net/Uri;", "contentResolver", "Landroid/content/ContentResolver;", "inflate", "root", "Landroid/view/ViewGroup;", "inflateBinding", "Landroidx/databinding/ViewDataBinding;", "(ILandroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "markRequired", "Lcom/google/android/material/textfield/TextInputLayout;", "observeAndRunUiCommands", "Landroidx/lifecycle/LifecycleOwner;", "commands", "Landroidx/lifecycle/LiveData;", "Landroidx/fragment/app/FragmentActivity;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "getActivity", "Lkotlin/Function0;", "observeInternetConnectivity", "Landroid/content/Context;", "overrideWith", "other", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rangeTo", "Lhu/ekreta/ellenorzo/util/CalendarProgression;", "setHtmlOrHide", "Landroid/widget/TextView;", "text", "setTextOrHide", "setup", "ItemViewModel", "ViewHolder", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "lifecycleOwner", "items", "viewHolderFactory", "Lkotlin/Function2;", "adapter", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "sortByProperty", "E", "", "property", "Lkotlin/reflect/KProperty1;", "locale", "Ljava/util/Locale;", "stringPref", "toPx", "trustAllCertificates", "Lokhttp3/OkHttpClient$Builder;", "update", "newValue", "updateIndex", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;Ljava/lang/Integer;)V", "urlEncoded", "encoder", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt */
/* compiled from: Extensions.kt */
public final class ExtensionsKt {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f15277a;

    /* renamed from: b */
    public static final ReadWriteProperty f15278b = stringIntentExtraAsProperty$default(null, 1, null);

    /* renamed from: c */
    public static final ReadWriteProperty f15279c = longIntentExtraAsProperty$default(null, 1, null);

    /* renamed from: d */
    public static final ReadWriteProperty f15280d = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$1(null);

    /* renamed from: e */
    public static final ReadWriteProperty f15281e = stringIntentExtraAsProperty$default(null, 1, null);

    /* renamed from: f */
    public static final ReadWriteProperty f15282f = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$2(null);

    /* renamed from: g */
    public static final ReadWriteProperty f15283g = stringIntentExtraAsProperty$default(null, 1, null);

    /* renamed from: h */
    public static final ReadWriteProperty f15284h = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$3(null);

    /* renamed from: i */
    public static final ReadWriteProperty f15285i = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$4(null);

    /* renamed from: j */
    public static final ReadWriteProperty f15286j = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$5(null);

    /* renamed from: k */
    public static final ReadWriteProperty f15287k = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$6(null);

    /* renamed from: l */
    public static final ReadWriteProperty f15288l = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$7(null);

    /* renamed from: m */
    public static final ReadWriteProperty f15289m = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$8(null);

    /* renamed from: n */
    public static final ReadWriteProperty f15290n = new C4402x1b131994(null);

    /* renamed from: o */
    public static final ReadWriteProperty f15291o = new C4421x7e04b8fe(null);

    /* renamed from: p */
    public static final ReadWriteProperty f15292p = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$9(null);

    /* renamed from: q */
    public static final ReadWriteProperty f15293q = new C4399x1f1c2640(null);

    /* renamed from: r */
    public static final ReadWriteProperty f15294r = new C4400x1f1c2641(null);

    /* renamed from: s */
    public static final ReadWriteProperty f15295s = new C4401x1f1c2642(null);

    static {
        Class<ExtensionsKt> cls = ExtensionsKt.class;
        String str = "app_studentProdRelease";
        f15277a = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "instituteCode", "getInstituteCode(Landroid/content/Intent;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "homeworkId", "getHomeworkId(Landroid/content/Intent;)Ljava/lang/Long;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "homeworkObject", "getHomeworkObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/homework/Homework;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "timeTableItemUid", "getTimeTableItemUid(Landroid/content/Intent;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "announcedTestObject", "getAnnouncedTestObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "profileId", "getProfileId(Landroid/content/Intent;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "messageObject", "getMessageObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/message/Message;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "timeTableItemDetailParameter", "getTimeTableItemDetailParameter(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/timetable/TimeTableItem;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "evaluationObject", "getEvaluationObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/evaluation/Evaluation;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "noteObject", "getNoteObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notes/Note;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "noticeBoardItemObject", "getNoticeBoardItemObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "profileObject", "getProfileObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/profile/Profile;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "messageTypeObject", "getMessageTypeObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notification/NotificationMessageType;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "omissionList", "getOmissionList(Landroid/content/Intent;)Ljava/util/List;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "omissionObject", "getOmissionObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/omission/Omission;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "subjectParameters", "getSubjectParameters(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "caseObject", "getCaseObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/BaseCase;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, str), "caseDetailParameter", "getCaseDetailParameter(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;"))};
    }

    /* renamed from: a */
    public static final AnnouncedTest m14626a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$announcedTestObject");
        return (AnnouncedTest) f15282f.getValue(intent, f15277a[4]);
    }

    /* renamed from: a */
    public static final String m14629a(String str) {
        return str != null ? str : "-";
    }

    /* renamed from: a */
    public static final void m14636a(Intent intent, AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$announcedTestObject");
        f15282f.setValue(intent, f15277a[4], announcedTest);
    }

    /* renamed from: a */
    public static final void m14637a(Intent intent, BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseObject");
        f15294r.setValue(intent, f15277a[16], baseCase);
    }

    /* renamed from: a */
    public static final void m14638a(Intent intent, CaseDetailParameter caseDetailParameter) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseDetailParameter");
        f15295s.setValue(intent, f15277a[17], caseDetailParameter);
    }

    /* renamed from: a */
    public static final void m14639a(Intent intent, Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$evaluationObject");
        f15286j.setValue(intent, f15277a[8], evaluation);
    }

    /* renamed from: a */
    public static final void m14640a(Intent intent, Homework homework) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkObject");
        f15280d.setValue(intent, f15277a[2], homework);
    }

    /* renamed from: a */
    public static final void m14641a(Intent intent, Message message) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageObject");
        f15284h.setValue(intent, f15277a[6], message);
    }

    /* renamed from: a */
    public static final void m14642a(Intent intent, Note note) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noteObject");
        f15287k.setValue(intent, f15277a[9], note);
    }

    /* renamed from: a */
    public static final void m14643a(Intent intent, NoticeBoardItem noticeBoardItem) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noticeBoardItemObject");
        f15288l.setValue(intent, f15277a[10], noticeBoardItem);
    }

    /* renamed from: a */
    public static final void m14644a(Intent intent, Omission omission) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionObject");
        f15292p.setValue(intent, f15277a[14], omission);
    }

    /* renamed from: a */
    public static final void m14645a(Intent intent, Profile profile) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileObject");
        f15289m.setValue(intent, f15277a[11], profile);
    }

    /* renamed from: a */
    public static final void m14646a(Intent intent, SubjectParameters subjectParameters) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$subjectParameters");
        f15293q.setValue(intent, f15277a[15], subjectParameters);
    }

    /* renamed from: a */
    public static final void m14647a(Intent intent, TimeTableItem timeTableItem) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$timeTableItemDetailParameter");
        f15285i.setValue(intent, f15277a[7], timeTableItem);
    }

    /* renamed from: a */
    public static final void m14648a(Intent intent, Long l) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkId");
        f15279c.setValue(intent, f15277a[1], l);
    }

    /* renamed from: a */
    public static final void m14649a(Intent intent, String str) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$instituteCode");
        f15278b.setValue(intent, f15277a[0], str);
    }

    /* renamed from: a */
    public static final void m14650a(Intent intent, List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionList");
        f15291o.setValue(intent, f15277a[13], list);
    }

    /* renamed from: a */
    public static final void m14657a(C3818m mVar, LiveData<Function1<C3737d, Unit>> liveData, Function0<? extends C3737d> function0) {
        Intrinsics.checkParameterIsNotNull(mVar, "$this$observeAndRunUiCommands");
        Intrinsics.checkParameterIsNotNull(liveData, "commands");
        Intrinsics.checkParameterIsNotNull(function0, "getActivity");
        liveData.mo6265a(mVar, new ExtensionsKt$observeAndRunUiCommands$1(function0));
    }

    /* renamed from: b */
    public static final CaseDetailParameter m14661b(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseDetailParameter");
        return (CaseDetailParameter) f15295s.getValue(intent, f15277a[17]);
    }

    /* renamed from: b */
    public static final String m14662b(String str) {
        return str == null || str.length() == 0 ? "-" : str;
    }

    /* renamed from: b */
    public static final void m14663b(Intent intent, String str) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileId");
        f15283g.setValue(intent, f15277a[5], str);
    }

    /* renamed from: c */
    public static final BaseCase m14665c(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseObject");
        return (BaseCase) f15294r.getValue(intent, f15277a[16]);
    }

    /* renamed from: c */
    public static final void m14666c(Intent intent, String str) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$timeTableItemUid");
        f15281e.setValue(intent, f15277a[3], str);
    }

    /* renamed from: d */
    public static final Evaluation m14667d(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$evaluationObject");
        return (Evaluation) f15286j.getValue(intent, f15277a[8]);
    }

    /* renamed from: e */
    public static final Long m14668e(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkId");
        return (Long) f15279c.getValue(intent, f15277a[1]);
    }

    /* renamed from: f */
    public static final Homework m14669f(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkObject");
        return (Homework) f15280d.getValue(intent, f15277a[2]);
    }

    /* renamed from: g */
    public static final String m14670g(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$instituteCode");
        return (String) f15278b.getValue(intent, f15277a[0]);
    }

    /* renamed from: h */
    public static final Message m14671h(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageObject");
        return (Message) f15284h.getValue(intent, f15277a[6]);
    }

    /* renamed from: i */
    public static final NotificationMessageType m14672i(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageTypeObject");
        return (NotificationMessageType) f15290n.getValue(intent, f15277a[12]);
    }

    public static /* synthetic */ ReadWriteProperty intIntentExtraAsProperty$default(Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return new C4403x3fe8d59c(num);
    }

    public static final /* synthetic */ <T> ReadWriteProperty<Intent, T> intentExtraAsProperty(T t, Function3<? super Intent, ? super String, ? super T, Unit> function3) {
        Intrinsics.checkParameterIsNotNull(function3, "put");
        Intrinsics.needClassReification();
        return new ExtensionsKt$intentExtraAsProperty$1(t, function3);
    }

    public static /* synthetic */ ReadWriteProperty intentExtraAsProperty$default(Object obj, Function3 function3, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        Intrinsics.checkParameterIsNotNull(function3, "put");
        Intrinsics.needClassReification();
        return new ExtensionsKt$intentExtraAsProperty$1(obj, function3);
    }

    /* renamed from: j */
    public static final Note m14673j(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noteObject");
        return (Note) f15287k.getValue(intent, f15277a[9]);
    }

    /* renamed from: k */
    public static final NoticeBoardItem m14674k(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noticeBoardItemObject");
        return (NoticeBoardItem) f15288l.getValue(intent, f15277a[10]);
    }

    /* renamed from: l */
    public static final List<Omission> m14675l(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionList");
        return (List) f15291o.getValue(intent, f15277a[13]);
    }

    public static /* synthetic */ ReadWriteProperty longIntentExtraAsProperty$default(Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return new C4404x912355d7(l);
    }

    /* renamed from: m */
    public static final Omission m14676m(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionObject");
        return (Omission) f15292p.getValue(intent, f15277a[14]);
    }

    /* renamed from: n */
    public static final String m14677n(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileId");
        return (String) f15283g.getValue(intent, f15277a[5]);
    }

    /* renamed from: o */
    public static final Profile m14678o(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileObject");
        return (Profile) f15289m.getValue(intent, f15277a[11]);
    }

    public static final /* synthetic */ <T> T overrideWith(T t, T t2) {
        Class<Object> cls = Object.class;
        Intrinsics.checkParameterIsNotNull(t, "$this$overrideWith");
        if (t2 == null) {
            return null;
        }
        String str = "T";
        Intrinsics.reifiedOperationMarker(4, str);
        Collection declaredMemberProperties = KClasses.getDeclaredMemberProperties(Reflection.getOrCreateKotlinClass(cls));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(declaredMemberProperties, 10)), 16));
        for (Object next : declaredMemberProperties) {
            linkedHashMap.put(((KProperty1) next).getName(), next);
        }
        Intrinsics.reifiedOperationMarker(4, str);
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(Reflection.getOrCreateKotlinClass(cls));
        if (primaryConstructor == null) {
            Intrinsics.throwNpe();
        }
        List<KParameter> parameters = primaryConstructor.getParameters();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10)), 16));
        for (KParameter kParameter : parameters) {
            Object obj = linkedHashMap.get(kParameter.getName());
            if (obj == null) {
                Intrinsics.throwNpe();
            }
            KProperty1 kProperty1 = (KProperty1) obj;
            Object obj2 = kProperty1.get(t2);
            if (obj2 == null) {
                obj2 = kProperty1.get(t);
            }
            Pair pair = TuplesKt.m17868to(kParameter, obj2);
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
        return primaryConstructor.callBy(linkedHashMap2);
    }

    /* renamed from: p */
    public static final SubjectParameters m14679p(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$subjectParameters");
        return (SubjectParameters) f15293q.getValue(intent, f15277a[15]);
    }

    public static /* synthetic */ ReadWriteProperty parcelableIntentExtraAsProperty$default(Parcelable parcelable, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelable = null;
        }
        Intrinsics.needClassReification();
        return new C4411x24e33bf(parcelable);
    }

    public static final /* synthetic */ <T extends Parcelable> ReadWriteProperty<Intent, List<T>> parcelableListIntentExtraAsProperty(List<? extends T> list) {
        return new C4419x7e04b8fc(list);
    }

    public static /* synthetic */ ReadWriteProperty parcelableListIntentExtraAsProperty$default(List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return new C4420x7e04b8fd(list);
    }

    /* renamed from: q */
    public static final TimeTableItem m14680q(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$timeTableItemDetailParameter");
        return (TimeTableItem) f15285i.getValue(intent, f15277a[7]);
    }

    public static /* synthetic */ ReadWriteProperty serializableIntentExtraAsProperty$default(Serializable serializable, int i, Object obj) {
        if ((i & 1) != 0) {
            serializable = null;
        }
        Intrinsics.needClassReification();
        return new C4423x52a7d11b(serializable);
    }

    public static /* synthetic */ Calendar setTimeInCalendar$default(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = 2019;
        }
        if ((i7 & 2) != 0) {
            i2 = 12;
        }
        if ((i7 & 4) != 0) {
            i3 = 24;
        }
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        instance.set(11, i4);
        instance.set(12, i5);
        instance.set(13, i6);
        instance.set(14, 0);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        return instance;
    }

    public static /* synthetic */ List sortByProperty$default(Iterable iterable, KProperty1 kProperty1, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        Intrinsics.checkParameterIsNotNull(iterable, "$this$sortByProperty");
        Intrinsics.checkParameterIsNotNull(kProperty1, "property");
        return CollectionsKt___CollectionsKt.sortedWith(iterable, new ExtensionsKt$sortByProperty$1(locale, kProperty1));
    }

    public static /* synthetic */ ReadWriteProperty stringIntentExtraAsProperty$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return new C4425xb628d7ec(str);
    }

    public static /* synthetic */ String urlEncoded$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "UTF-8";
        }
        Intrinsics.checkParameterIsNotNull(str, "$this$urlEncoded");
        Intrinsics.checkParameterIsNotNull(str2, "encoder");
        String encode = URLEncoder.encode(str, str2);
        Intrinsics.checkExpressionValueIsNotNull(encode, "URLEncoder.encode(this, encoder)");
        return encode;
    }

    /* renamed from: a */
    public static final LayoutInflater m14625a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$layoutInflater");
        return LayoutInflater.from(view.getContext());
    }

    /* renamed from: b */
    public static final void m14664b(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setTextOrHide");
        int i = 0;
        if (!(str == null || str.length() == 0)) {
            textView.setText(str);
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public static final ReadWriteProperty<Object, Boolean> m14635a(SharedPreferences sharedPreferences, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "$this$booleanPref");
        Intrinsics.checkParameterIsNotNull(str, "key");
        return new ExtensionsKt$booleanPref$1(sharedPreferences, str, z);
    }

    /* renamed from: a */
    public static final ReadWriteProperty<Object, String> m14634a(SharedPreferences sharedPreferences, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "$this$stringPref");
        Intrinsics.checkParameterIsNotNull(str, "key");
        return new ExtensionsKt$stringPref$1(sharedPreferences, str, str2);
    }

    /* renamed from: a */
    public static final <R> C5027n<R> m14633a(C5074f0 f0Var, Function1<? super C5179y, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(f0Var, "$this$executeTransaction");
        Intrinsics.checkParameterIsNotNull(function1, "transaction");
        ExtensionsKt$executeTransaction$1 extensionsKt$executeTransaction$1 = new ExtensionsKt$executeTransaction$1(f0Var, function1);
        C4704b.m16116a(extensionsKt$executeTransaction$1, "source is null");
        C5027n<R> b = C4664d.m16039a((C5027n<T>) new C4827h<T>(extensionsKt$executeTransaction$1)).mo17227b(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(b, "Observable.create { emit…dSchedulers.mainThread())");
        return b;
    }

    /* renamed from: a */
    public static final <ItemViewModel, ViewHolder extends MVVMViewHolder<? super ItemViewModel>> void m14654a(RecyclerView recyclerView, C3818m mVar, LiveData<List<ItemViewModel>> liveData, Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder> function2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(mVar, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(liveData, "items");
        Intrinsics.checkParameterIsNotNull(function2, "viewHolderFactory");
        m14653a(recyclerView, mVar, liveData, new MVVMRecyclerViewAdapter<>(function2));
    }

    /* renamed from: a */
    public static final <ItemViewModel, ViewHolder extends MVVMViewHolder<? super ItemViewModel>> void m14653a(RecyclerView recyclerView, C3818m mVar, LiveData<List<ItemViewModel>> liveData, MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder> mVVMRecyclerViewAdapter) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(mVar, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(liveData, "items");
        Intrinsics.checkParameterIsNotNull(mVVMRecyclerViewAdapter, "adapter");
        liveData.mo6265a(mVar, mVVMRecyclerViewAdapter);
        m14652a(recyclerView, (C2900g<ViewHolder>) mVVMRecyclerViewAdapter);
    }

    /* renamed from: a */
    public static final <ItemViewModel, ViewHolder extends MVVMViewHolder<? super ItemViewModel>> void m14655a(RecyclerView recyclerView, List<? extends ItemViewModel> list, Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder> function2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(list, "items");
        Intrinsics.checkParameterIsNotNull(function2, "viewHolderFactory");
        MVVMRecyclerViewAdapter mVVMRecyclerViewAdapter = new MVVMRecyclerViewAdapter(function2);
        m14652a(recyclerView, (C2900g<ViewHolder>) mVVMRecyclerViewAdapter);
        mVVMRecyclerViewAdapter.onChanged(list);
    }

    /* renamed from: a */
    public static final <ViewHolder extends C2897d0> void m14652a(RecyclerView recyclerView, C2900g<ViewHolder> gVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(gVar, "adapter");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(gVar);
    }

    /* renamed from: a */
    public static final CalendarProgression m14627a(Calendar calendar, Calendar calendar2) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$rangeTo");
        Intrinsics.checkParameterIsNotNull(calendar2, "other");
        CalendarProgression calendarProgression = new CalendarProgression(calendar, calendar2, 0, 4, null);
        return calendarProgression;
    }

    /* renamed from: a */
    public static final int m14624a(int i) {
        float f = (float) i;
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return (int) (f * system.getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static final String m14630a(C5639d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$asString");
        List listOf = CollectionsKt__CollectionsKt.listOf("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
        C5664a a = C5664a.m18957a("yyyy. LLLL. d.");
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo22046a(a));
        sb.append(' ');
        C5636a e = dVar.mo22065e();
        Intrinsics.checkExpressionValueIsNotNull(e, "this.dayOfWeek");
        sb.append((String) listOf.get(e.mo22016a() - 1));
        return sb.toString();
    }

    /* renamed from: a */
    public static final <TModel> C5027n<TModel> m14632a(C5027n<List<TModel>> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$firstOrEmpty");
        return nVar.mo17211a((C4676i<? super T>) ExtensionsKt$firstOrEmpty$1.INSTANCE).mo17246g(ExtensionsKt$firstOrEmpty$2.INSTANCE);
    }

    /* renamed from: a */
    public static final void m14651a(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setHtmlOrHide");
        int i = 0;
        if (!(str == null || str.length() == 0)) {
            C3984v.m10230a(textView, str);
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public static final String m14628a(Uri uri, ContentResolver contentResolver) {
        Intrinsics.checkParameterIsNotNull(uri, "$this$getFileName");
        Intrinsics.checkParameterIsNotNull(contentResolver, "contentResolver");
        String scheme = uri.getScheme();
        String str = "";
        if (Intrinsics.areEqual((Object) scheme, (Object) "file")) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                return lastPathSegment;
            }
            return str;
        } else if (!Intrinsics.areEqual((Object) scheme, (Object) "content")) {
            return str;
        } else {
            Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query != null && query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("_display_name"));
                Intrinsics.checkExpressionValueIsNotNull(string, "cursor.getString(cursor.…bleColumns.DISPLAY_NAME))");
                str = string;
            }
            query.close();
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m14659a(p211h.p271p.C3824r<java.util.List<T>> r1, java.util.List<? extends T> r2) {
        /*
            java.lang.String r0 = "$this$addAll"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = "newValues"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.Object r0 = r1.mo6263a()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.mo6263a()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0023
            java.util.Set r2 = kotlin.collections.CollectionsKt___CollectionsKt.union(r0, r2)
            if (r2 == 0) goto L_0x0023
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r2)
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 != 0) goto L_0x0029
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0029:
            r1.postValue(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14659a(h.p.r, java.util.List):void");
    }

    /* renamed from: a */
    public static final <T> void m14658a(C3824r<List<T>> rVar, T t, Integer num) {
        List list;
        Intrinsics.checkParameterIsNotNull(rVar, "$this$update");
        if (num == null || num.intValue() != -1) {
            List list2 = (List) rVar.mo6263a();
            if (list2 != null) {
                list = CollectionsKt___CollectionsKt.toMutableList((Collection<? extends T>) list2);
                if (list != null) {
                    if (num == null) {
                        Intrinsics.throwNpe();
                    }
                    list.set(num.intValue(), t);
                    rVar.postValue(list);
                }
            }
            list = null;
            rVar.postValue(list);
        }
    }

    /* renamed from: a */
    public static final boolean m14660a(C4663c cVar, C4662b bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$disposeWith");
        Intrinsics.checkParameterIsNotNull(bVar, "disposables");
        return bVar.mo16967c(cVar);
    }

    /* renamed from: a */
    public static final <TItemType> List<TItemType> m14631a(Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "$this$cast");
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            List list = objArr[i];
            if (list != null) {
                CollectionsKt__MutableCollectionsKt.addAll((Collection<? super T>) arrayList, (Iterable<? extends T>) list);
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<TItemType>");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final void m14656a(TextInputLayout textInputLayout) {
        Intrinsics.checkParameterIsNotNull(textInputLayout, "$this$markRequired");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(textInputLayout.getHint());
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-65536);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(" *");
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        textInputLayout.setHint(new SpannedString(spannableStringBuilder));
    }
}
