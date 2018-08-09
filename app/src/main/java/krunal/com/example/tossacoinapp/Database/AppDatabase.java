package krunal.com.example.tossacoinapp.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {FlipHistoryEntity.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract FlipHistoryDao get_FlipHistory_doa();

    private static AppDatabase INSTANCE;

    static AppDatabase getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE =  buildDatabase(context);
        }

        return INSTANCE;
    }

    private static AppDatabase buildDatabase(Context context){
        String dbname = "db";
        return Room.databaseBuilder(context,AppDatabase.class,dbname).build();
    }

}
