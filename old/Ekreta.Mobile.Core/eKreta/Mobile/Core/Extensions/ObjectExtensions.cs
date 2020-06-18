// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.ObjectExtensions
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;

namespace Ekreta.Mobile.Core.Extensions
{
  public static class ObjectExtensions
  {
    public static TResult GetPropertyValue<TValue, TResult>(this TValue obj, string propertyPath)
    {
      if (string.IsNullOrEmpty(propertyPath))
        return default (TResult);
      ParameterExpression parameterExpression = Expression.Parameter(typeof (TValue));
      Expression expression = (Expression) parameterExpression;
      string str = propertyPath;
      char[] chArray = new char[1]{ '.' };
      foreach (string propertyOrFieldName in str.Split(chArray))
        expression = (Expression) Expression.PropertyOrField(expression, propertyOrFieldName);
      return (TResult) Expression.Lambda<Func<TValue, object>>(expression, parameterExpression).Compile()(obj);
    }

    public static T ToObject<T>(this IDictionary<string, object> source) where T : class, new()
    {
      T obj = new T();
      Type type = obj.GetType();
      foreach (KeyValuePair<string, object> keyValuePair in (IEnumerable<KeyValuePair<string, object>>) source)
        type.GetProperty(keyValuePair.Key).SetValue((object) obj, keyValuePair.Value, (object[]) null);
      return obj;
    }

    public static IDictionary<string, object> AsDictionary(
      this object source,
      BindingFlags bindingAttr = BindingFlags.Instance | BindingFlags.Public)
    {
      return (IDictionary<string, object>) ((IEnumerable<PropertyInfo>) source.GetType().GetProperties(bindingAttr)).ToDictionary<PropertyInfo, string, object>((Func<PropertyInfo, string>) (propInfo => propInfo.Name), (Func<PropertyInfo, object>) (propInfo => propInfo.GetValue(source, (object[]) null)));
    }

    public static IDictionary<string, string> AsStringDictionary(
      this object source,
      BindingFlags bindingAttr = BindingFlags.Instance | BindingFlags.Public)
    {
      return (IDictionary<string, string>) ((IEnumerable<PropertyInfo>) source.GetType().GetProperties(bindingAttr)).ToDictionary<PropertyInfo, string, string>((Func<PropertyInfo, string>) (propInfo => propInfo.Name), (Func<PropertyInfo, string>) (propInfo => propInfo.GetValue(source, (object[]) null).ToString()));
    }
  }
}
