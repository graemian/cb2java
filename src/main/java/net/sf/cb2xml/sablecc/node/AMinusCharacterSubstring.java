/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class AMinusCharacterSubstring extends PCharacterSubstring
{
    private TMinus _minus_;

    public AMinusCharacterSubstring ()
    {
    }

    public AMinusCharacterSubstring (TMinus _minus_)
    {
        setMinus (_minus_);
    }

    public Object clone ()
    {
        return new AMinusCharacterSubstring((TMinus) cloneNode (_minus_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseAMinusCharacterSubstring (this);
    }

    public TMinus getMinus ()
    {
        return _minus_;
    }

    public void setMinus (TMinus node)
    {
        if (_minus_ != null)
        {
            _minus_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _minus_ = node;
    }

    public String toString ()
    {
        return "" + toString (_minus_);
    }

    void removeChild (Node child)
    {
        if (_minus_ == child)
        {
            _minus_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_minus_ == oldChild)
        {
            setMinus ((TMinus) newChild);

            return;
        }
    }
}
