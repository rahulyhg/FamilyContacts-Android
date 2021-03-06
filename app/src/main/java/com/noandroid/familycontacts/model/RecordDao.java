package com.noandroid.familycontacts.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.noandroid.familycontacts.model.Record;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECORD".
*/
public class RecordDao extends AbstractDao<Record, Long> {

    public static final String TABLENAME = "RECORD";

    /**
     * Properties of entity Record.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Time = new Property(1, java.util.Date.class, "time", false, "TIME");
        public final static Property Status = new Property(2, int.class, "status", false, "STATUS");
        public final static Property TelephoneNumber = new Property(3, String.class, "telephoneNumber", false, "TELEPHONE_NUMBER");
        public final static Property Duration = new Property(4, Integer.class, "duration", false, "DURATION");
    };


    public RecordDao(DaoConfig config) {
        super(config);
    }
    
    public RecordDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECORD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TIME\" INTEGER NOT NULL ," + // 1: time
                "\"STATUS\" INTEGER NOT NULL ," + // 2: status
                "\"TELEPHONE_NUMBER\" TEXT NOT NULL ," + // 3: telephoneNumber
                "\"DURATION\" INTEGER);"); // 4: duration
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECORD\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Record entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getTime().getTime());
        stmt.bindLong(3, entity.getStatus());
        stmt.bindString(4, entity.getTelephoneNumber());
 
        Integer duration = entity.getDuration();
        if (duration != null) {
            stmt.bindLong(5, duration);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Record readEntity(Cursor cursor, int offset) {
        Record entity = new Record( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            new java.util.Date(cursor.getLong(offset + 1)), // time
            cursor.getInt(offset + 2), // status
            cursor.getString(offset + 3), // telephoneNumber
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4) // duration
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Record entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTime(new java.util.Date(cursor.getLong(offset + 1)));
        entity.setStatus(cursor.getInt(offset + 2));
        entity.setTelephoneNumber(cursor.getString(offset + 3));
        entity.setDuration(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Record entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Record entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
