package lecho.lib.hellochart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import lecho.lib.hellochart.R;

/**
 * Created by WeiTiancheng on 2016/1/12.
 */
public class VideoPlayer extends RelativeLayout{


    private Context context;
    @Bind(R.id.video_view_layout)
    RelativeLayout videoViewLayout;

    public VideoPlayer(Context context) {
        this(context, null);
    }

    public VideoPlayer(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VideoPlayer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }

    private void init(){

        View view = LayoutInflater.from(context).inflate(R.layout.video_player, this);

        ButterKnife.bind(context, view);




    }








}
