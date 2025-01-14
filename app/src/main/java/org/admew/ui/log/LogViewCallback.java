package org.admew.ui.log;

import androidx.annotation.NonNull;

import org.admew.db.entity.ListType;

/**
 * This class is represents the {@link LogActivity} callback.
 *
 * @author Bruce BUJON (bruce.bujon(at)gmail(dot)com)
 */
public interface LogViewCallback {
    /**
     * Add a {@link org.admew.db.entity.HostListItem}.
     *
     * @param hostName The item host name.
     * @param type     The item type.
     */
    void addListItem(@NonNull String hostName, @NonNull ListType type);

    /**
     * Remove a {@link org.admew.db.entity.HostListItem}
     *
     * @param hostName The item host name.
     */
    void removeListItem(@NonNull String hostName);

    /**
     * Open an host into the user browser.
     *
     * @param hostName The host name to open.
     */
    void openHostInBrowser(@NonNull String hostName);

    /**
     * Copy an host into the clipboard.
     *
     * @param hostName The list to copy hosts.
     */
    void copyHostToClipboard(@NonNull String hostName);

    /**
     * Get color value from color identifier.
     *
     * @param colorId The color identifier.
     * @return The related color value.
     */
    int getColor(int colorId);
}
