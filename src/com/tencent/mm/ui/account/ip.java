package com.tencent.mm.ui.account;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class ip
  implements TextView.OnEditorActionListener
{
  ip(RegSetInfoUI paramRegSetInfoUI) {}
  
  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 6) || (paramInt == 5))
    {
      RegSetInfoUI.q(ixd);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.account.ip
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */