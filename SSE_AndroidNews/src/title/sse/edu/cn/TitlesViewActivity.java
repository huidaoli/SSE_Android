package title.sse.edu.cn;
import content.sse.edu.cn.NewsCon_sseActivity;
import title.sse.edu.cn.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
public class TitlesViewActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);//�̳и��෽��
		setListAdapter(new ArrayAdapter<String>(this, R.layout.titles_sse,
				NewsTitle_sseActivity.GetNewsTitleList()));// ����Adapter������
		ListView titlesUI = getListView();// ���ļ�xml�ļ�������ListView
		titlesUI.setTextFilterEnabled(true);
		titlesUI.setOnItemClickListener(new OnItemClickListener() {//��Ӽ�����
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				setListAdapter(new ArrayAdapter<String>(//��item���������ᴥ���¼���ʹ����ת���������ɵ�ListView
						TitlesViewActivity.this, R.layout.titles_sse,
						NewsCon_sseActivity.GetNewsConList((int)id)));
				ListView contentUI = getListView();// ���ļ�xml�ļ�������ListView
				contentUI.setTextFilterEnabled(true);
			}
		});
	}
}
