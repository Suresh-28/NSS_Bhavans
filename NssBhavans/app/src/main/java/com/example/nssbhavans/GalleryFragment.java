package com.example.nssbhavans;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class GalleryFragment extends Fragment {
    ImageView bloodcamp,vaccination,greenweek,constitution,firesafety,naac,republic,cycle,orphanage,ugc,poshan,orientation,farmer,
    orange,malaria,aids,diabetes,blanket,camp;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_gallery, container, false);
        greenweek=view.findViewById(R.id.greenweek);
        constitution=view.findViewById(R.id.constitution);
        firesafety=view.findViewById(R.id.firesafety);
        naac=view.findViewById(R.id.naccpeer);
        republic=view.findViewById(R.id.republic);
        cycle=view.findViewById(R.id.cycle);
        orphanage=view.findViewById(R.id.orphange);
        ugc=view.findViewById(R.id.ugc);
        poshan=view.findViewById(R.id.poshan);
        orientation=view.findViewById(R.id.orientation);
        farmer=view.findViewById(R.id.farmer);
        orange=view.findViewById(R.id.orange);
        malaria=view.findViewById(R.id.malaria);

        diabetes=view.findViewById(R.id.diabetes);
        blanket=view.findViewById(R.id.blanket);
        camp=view.findViewById(R.id.camp);
        bloodcamp=view.findViewById(R.id.blood);
        vaccination=view.findViewById(R.id.vaccine);
        greenweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getActivity(),GreenweekGallery.class);
                startActivity(intent3);
            }
        });
        constitution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getActivity(),ConsitutionGallery.class);
                startActivity(intent4);
            }
        });
        firesafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(getActivity(),FireSafetyGallery.class);
                startActivity(intent5);
            }
        });
        naac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(getActivity(),NaacPeerTeamgallery.class);
                startActivity(intent6);
            }
        });
        republic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(getActivity(),RepublicGallery.class);
                startActivity(intent7);
            }
        });
        cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(getActivity(),CycleGallery.class);
                startActivity(intent8);
            }
        });
        orphanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(getActivity(),OrphanageGallery.class);
                startActivity(intent9);
            }
        });
        ugc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(getActivity(),UgcGallery.class);
                startActivity(intent10);
            }
        });
    orientation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent11=new Intent(getActivity(),OrientationGallery.class);
            startActivity(intent11);
        }
    });
    farmer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent12=new Intent(getActivity(),FarmersDallery.class);
            startActivity(intent12);
        }
    });
    orange.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent13=new Intent(getActivity(),OrangedayGallery.class);
            startActivity(intent13);
        }
    });
    malaria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent14=new Intent(getActivity(),MalariaGallery.class);
            startActivity(intent14);
        }
    });

    diabetes.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent16=new Intent(getActivity(),DiabetesGallery.class);
            startActivity(intent16);
        }
    });
    blanket.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent17= new Intent(getActivity(),BlanketGallery.class);
            startActivity(intent17);
        }
    });
    camp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent18=new Intent(getActivity(),CampGallery.class);
            startActivity(intent18);
        }
    });
        bloodcamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), BloodDonationGalleryActivity.class);
                startActivity(intent);

            }
        });
        vaccination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getActivity(), VaccinationGalleryActivity.class);
                startActivity(intent1);

            }
        });
        return view;
    }
}