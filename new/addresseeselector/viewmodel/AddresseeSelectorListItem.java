package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import a.b.a.a.a;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JG\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\u000e\u00101\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0003J \u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0003H\u0002J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\rR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;", "", "name", "", "type", "description", "value", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "onClickListener", "Lkotlin/Function1;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/newmessage/model/Addressee;Lkotlin/jvm/functions/Function1;)V", "getDescription", "()Ljava/lang/String;", "formattedDescription", "", "getFormattedDescription", "()Ljava/lang/CharSequence;", "setFormattedDescription", "(Ljava/lang/CharSequence;)V", "formattedName", "getFormattedName", "setFormattedName", "formattedType", "getFormattedType", "setFormattedType", "getName", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "searchDescription", "getSearchDescription", "searchName", "getSearchName", "searchType", "getSearchType", "getType", "getValue", "()Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "highlight", "text", "searchableText", "toSpanned", "Landroid/text/Spanned;", "html", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorListItem.kt */
public final class AddresseeSelectorListItem {

    /* renamed from: a  reason: collision with root package name */
    public final String f4980a = AddresseeFilter.INSTANCE.a(this.f4982g);
    public final String b = AddresseeFilter.INSTANCE.a(this.f4983h);
    public final String c = AddresseeFilter.INSTANCE.a(this.f4984i);

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f4981d = b(this.f4982g);
    public CharSequence e = b(this.f4983h);
    public CharSequence f = b(this.f4984i);

    /* renamed from: g  reason: collision with root package name */
    public final String f4982g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4983h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4984i;

    /* renamed from: j  reason: collision with root package name */
    public final Addressee f4985j;

    /* renamed from: k  reason: collision with root package name */
    public final Function1<Addressee, Unit> f4986k;

    public AddresseeSelectorListItem(String str, String str2, String str3, Addressee addressee, Function1<? super Addressee, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "type");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        Intrinsics.checkParameterIsNotNull(addressee, "value");
        Intrinsics.checkParameterIsNotNull(function1, "onClickListener");
        this.f4982g = str;
        this.f4983h = str2;
        this.f4984i = str3;
        this.f4985j = addressee;
        this.f4986k = function1;
    }

    public static /* synthetic */ AddresseeSelectorListItem copy$default(AddresseeSelectorListItem addresseeSelectorListItem, String str, String str2, String str3, Addressee addressee, Function1<Addressee, Unit> function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = addresseeSelectorListItem.f4982g;
        }
        if ((i2 & 2) != 0) {
            str2 = addresseeSelectorListItem.f4983h;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = addresseeSelectorListItem.f4984i;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            addressee = addresseeSelectorListItem.f4985j;
        }
        Addressee addressee2 = addressee;
        if ((i2 & 16) != 0) {
            function1 = addresseeSelectorListItem.f4986k;
        }
        return addresseeSelectorListItem.a(str, str4, str5, addressee2, function1);
    }

    public final AddresseeSelectorListItem a(String str, String str2, String str3, Addressee addressee, Function1<? super Addressee, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "type");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        Intrinsics.checkParameterIsNotNull(addressee, "value");
        Intrinsics.checkParameterIsNotNull(function1, "onClickListener");
        return new AddresseeSelectorListItem(str, str2, str3, addressee, function1);
    }

    public final CharSequence a() {
        return this.f;
    }

    public final CharSequence b() {
        return this.f4981d;
    }

    public final CharSequence c() {
        return this.e;
    }

    public final Function1<Addressee, Unit> d() {
        return this.f4986k;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddresseeSelectorListItem)) {
            return false;
        }
        AddresseeSelectorListItem addresseeSelectorListItem = (AddresseeSelectorListItem) obj;
        return Intrinsics.areEqual((Object) this.f4982g, (Object) addresseeSelectorListItem.f4982g) && Intrinsics.areEqual((Object) this.f4983h, (Object) addresseeSelectorListItem.f4983h) && Intrinsics.areEqual((Object) this.f4984i, (Object) addresseeSelectorListItem.f4984i) && Intrinsics.areEqual((Object) this.f4985j, (Object) addresseeSelectorListItem.f4985j) && Intrinsics.areEqual((Object) this.f4986k, (Object) addresseeSelectorListItem.f4986k);
    }

    public final String f() {
        return this.f4980a;
    }

    public final String g() {
        return this.b;
    }

    public final Addressee h() {
        return this.f4985j;
    }

    public int hashCode() {
        String str = this.f4982g;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4983h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4984i;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Addressee addressee = this.f4985j;
        int hashCode4 = (hashCode3 + (addressee != null ? addressee.hashCode() : 0)) * 31;
        Function1<Addressee, Unit> function1 = this.f4986k;
        if (function1 != null) {
            i2 = function1.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("AddresseeSelectorListItem(name=");
        a2.append(this.f4982g);
        a2.append(", type=");
        a2.append(this.f4983h);
        a2.append(", description=");
        a2.append(this.f4984i);
        a2.append(", value=");
        a2.append(this.f4985j);
        a2.append(", onClickListener=");
        a2.append(this.f4986k);
        a2.append(")");
        return a2.toString();
    }

    public final void a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "highlight");
        String a2 = AddresseeFilter.INSTANCE.a(str);
        this.f4981d = b(a(this.f4982g, this.f4980a, a2));
        this.e = b(a(this.f4983h, this.b, a2));
        this.f = b(a(this.f4984i, this.c, a2));
    }

    public final Spanned b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "html");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned fromHtml = Html.fromHtml(str, 0);
            Intrinsics.checkExpressionValueIsNotNull(fromHtml, "Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY)");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        Intrinsics.checkExpressionValueIsNotNull(fromHtml2, "Html.fromHtml(html)");
        return fromHtml2;
    }

    public final String a(String str, String str2, String str3) {
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, str3, 0, false, 6, (Object) null);
        return indexOf$default != -1 ? AddresseeFilter.INSTANCE.a(str, indexOf$default, str3.length()) : str;
    }
}
