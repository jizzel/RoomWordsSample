package com.codelabs.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "word")
    String mWord;

    public Word(@NonNull String word){mWord=word;}

    public String getWord() {
        return mWord;
    }
}
