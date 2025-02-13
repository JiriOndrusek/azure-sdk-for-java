// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProfanityAction. */
public final class ProfanityAction extends ExpandableStringEnum<ProfanityAction> {
    /** Static value NoAction for ProfanityAction. */
    public static final ProfanityAction NO_ACTION = fromString("NoAction");

    /** Static value Marked for ProfanityAction. */
    public static final ProfanityAction MARKED = fromString("Marked");

    /** Static value Deleted for ProfanityAction. */
    public static final ProfanityAction DELETED = fromString("Deleted");

    /**
     * Creates a new instance of ProfanityAction value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProfanityAction() {}

    /**
     * Creates or finds a ProfanityAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProfanityAction.
     */
    @JsonCreator
    public static ProfanityAction fromString(String name) {
        return fromString(name, ProfanityAction.class);
    }

    /**
     * Gets known ProfanityAction values.
     *
     * @return known ProfanityAction values.
     */
    public static Collection<ProfanityAction> values() {
        return values(ProfanityAction.class);
    }
}
