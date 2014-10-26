package org.example.just_click.demo;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
            @Override
			public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.prothom-alo.com/"));
                    startActivity(myWebLink);
                    
	}
        });
        Button btn1 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new OnClickListener() {
            @Override
			public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.kalerkantho.com/index.php"));
                    startActivity(myWebLink); 
            }
        });
                    Button btn2 = (Button) findViewById(R.id.button3);
                    btn2.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://bdnews24.com/"));
                                startActivity(myWebLink); 
            }
        });
                    Button btn3 = (Button) findViewById(R.id.button4);
                    btn3.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://dailyjanakantha.com/"));
                                startActivity(myWebLink); 
                        }
                    });
                    Button btn4 = (Button) findViewById(R.id.button8);
                    btn4.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://jugantor.biz/"));
                                startActivity(myWebLink); 
                        }
                    });
                    Button btn5 = (Button) findViewById(R.id.button5);
                    btn5.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://dainikazadi.org/index1.php"));
                                startActivity(myWebLink); 
                        }
                    });
                    Button btn6 = (Button) findViewById(R.id.button6);
                    btn6.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://archive.thedailystar.net/beta2/"));
                                startActivity(myWebLink); 
                        }
                    });
                    Button btn7 = (Button) findViewById(R.id.button7);
                    btn7.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://shamokal.com/"));
                                startActivity(myWebLink); 
                        }
                    });
                    Button btn8 = (Button) findViewById(R.id.button9);
                    btn8.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://somoynews.tv/"));
                                startActivity(myWebLink); 
                        }
                    });
                    Button btn9 = (Button) findViewById(R.id.button10);
                    btn9.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://www.theindependentbd.com/"));
                                startActivity(myWebLink); 
                        }
                    });
                    
                    Button btn10 = (Button) findViewById(R.id.button12);
                    btn10.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://www.deshebideshe.com"));
                                startActivity(myWebLink); 
                        }
                    });
                    Button btn12 = (Button) findViewById(R.id.button11);
                    btn12.setOnClickListener(new OnClickListener() {
                        @Override
						public void onClick(View v) {
                            Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                            myWebLink.setData(Uri.parse("http://www.alltimenews.com/"));
                                startActivity(myWebLink); 
                        }
                    });
                    
                 
	}
       
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
}
